package com.school.management.controller;

import com.school.management.dao.CourseDAO;
import com.school.management.dao.UserDAO;
import com.school.management.entity.Course;
import com.school.management.entity.User;
import com.school.management.form.CreateCourseForm;
import com.school.management.form.EditCourseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller  //class level
public class CourseController {

	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private CourseDAO courseDAO;

	@RequestMapping(value = "/course", method = RequestMethod.GET)   //method level
    public ModelAndView createcoursePage() {
        ModelAndView result = new ModelAndView("course/courserUpdate");
        result.addObject("form", new CreateCourseForm());

        return result;
    }

	@RequestMapping(value = "/course", method = RequestMethod.POST)  //method level
	public ModelAndView createclass( @Valid CreateCourseForm form, BindingResult bindingResult) throws Exception {
		ModelAndView result = new ModelAndView("course/courserUpdate");

		// form validation
		result.addObject("form", form);

		System.out.println(form);

		if (bindingResult.hasErrors()) {

			List<String> errors = new ArrayList<String>();

			for (FieldError error : bindingResult.getFieldErrors()) {
				System.out.println(error.getField() + " = " + error.getDefaultMessage());
				errors.add(error.getDefaultMessage());
			}

			result.addObject("errorFields", bindingResult.getFieldErrors());
			result.addObject("errors", errors);
			
			return result;
		} 

		User user = new User();
		Course course = new Course();

		course.setCourseName(form.getCourseName());
		course.setSemesterOffered(form.getSemesterOffered());

		courseDAO.save(course);
		user = userDao.findByEmail(getUserEmail());
		user.getCourses().add(course);
		userDao.save(user);

		return result;
	}

	@RequestMapping(value = "/courseEdit", method = RequestMethod.GET)  //method level
	public ModelAndView courseEditPage() {
		ModelAndView result = new ModelAndView("course/courserEdit");
		result.addObject("form", new EditCourseForm());
	
		return result;
	}


	@RequestMapping(value = "/courseEdit", method = RequestMethod.POST)  // method level
	public ModelAndView courseEditpage(@Valid EditCourseForm form, BindingResult bindingResult) throws Exception {
		ModelAndView result = new ModelAndView("course/courserEdit");

		// form validation
		result.addObject("form", form);

		System.out.println(form);

		if (bindingResult.hasErrors()) {

			List<String> errors = new ArrayList<String>();

			for (FieldError error : bindingResult.getFieldErrors()) {
				System.out.println(error.getField() + " = " + error.getDefaultMessage());
				errors.add(error.getDefaultMessage());
			}

			result.addObject("errorFields", bindingResult.getFieldErrors());
			result.addObject("errors", errors);

			return result;
		}

		User user = new User();
		Course course = courseDAO.findById(Integer.parseInt(form.getId()));
		course.setCourseName(form.getCourseName());
		course.setSemesterOffered(form.getSemesterOffered());
		courseDAO.save(course);

		return result;
	}
	public String getUserEmail() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			String username = ((UserDetails)principal).getUsername();
			return username;
		} else {
			String username = principal.toString();
			return "";
		}
	}

}
