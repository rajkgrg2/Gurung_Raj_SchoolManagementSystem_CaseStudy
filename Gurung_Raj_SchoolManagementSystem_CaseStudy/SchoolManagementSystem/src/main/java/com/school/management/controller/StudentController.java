package com.school.management.controller;

import com.school.management.dao.StudentDAO;
import com.school.management.dao.UserDAO;
import com.school.management.entity.*;
import com.school.management.form.CreateStudentForm;
import com.school.management.dao.*;

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

@Controller
public class StudentController {

    @Autowired
    private UserDAO userDao;

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(value = "/student", method = RequestMethod.GET)  //method level RM
    public ModelAndView createStudentPage() {
        ModelAndView result = new ModelAndView("student/studentUpdate");
        result.addObject("form", new CreateStudentForm());
      

        User user = userDao.findByEmail(getUserEmail());
        Student student = studentDAO.findById(user.getId());

        result.addObject("student", student);

        return result;
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ModelAndView createStudent(@Valid CreateStudentForm form, BindingResult bindingResult) throws Exception {
        ModelAndView result = new ModelAndView("student/studentUpdate");

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
        Student student = new Student();
       
        student.setFirstName(form.getFirst_name());
        student.setLastName(form.getLast_name());

        user = userDao.findByEmail(getUserEmail());
        student.setId(user.getId());
        studentDAO.save(student);

        // goto the next page

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
