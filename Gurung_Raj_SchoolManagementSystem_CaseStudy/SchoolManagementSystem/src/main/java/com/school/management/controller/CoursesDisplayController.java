package com.school.management.controller;

import com.school.management.dao.CourseDAO;
import com.school.management.entity.Course;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CoursesDisplayController {
	
	@Autowired
	private CourseDAO courseDAO;

	@RequestMapping(value = "/courseDisplay", method = RequestMethod.GET)
	public ModelAndView search1() {
		ModelAndView response = new ModelAndView();
		response.setViewName("course/courseDisplay");
		List<Course> courses = new ArrayList<Course>();

		courses = courseDAO.findAll();
		courses.forEach(
				(n)->System.out.println(n.toString())
		);
		response.addObject("courses", courses);
		response.addObject("search", "yes");
		return response;
	}


	@RequestMapping(value = "/courseDisp", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam(required = false) String search) {
		ModelAndView response = new ModelAndView();
		response.setViewName("course/courseDisplay");

		List<Course> courses = new ArrayList<Course>();
		if (!StringUtils.isEmpty(search)) {
			if(search.contains(" ")){
				search= search.substring(0, search.indexOf(" "));
			}
			courses = courseDAO.findByName(search);
		}

		courses.forEach(
				(n)->System.out.println(n.toString())
		);
		response.addObject("courses", courses);
		response.addObject("search", search);

		return response;
	}


	@Transactional
	@RequestMapping(value = "/deleteCourse", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam(required = false) int id) {
		ModelAndView response = new ModelAndView();
		response.setViewName("course/courseDisplay");
		courseDAO.removeCoursesById(id);

		List<Course> courses = new ArrayList<Course>();

		courses = courseDAO.findAll();
		courses.forEach(
				(n)->System.out.println(n.toString())
		);
		response.addObject("courses", courses);
		response.addObject("search", id);

		return response;
	}
}
