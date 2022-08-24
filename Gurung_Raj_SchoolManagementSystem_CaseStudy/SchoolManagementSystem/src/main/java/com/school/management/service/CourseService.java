package com.school.management.service;

import com.school.management.dao.CourseDAO;
import com.school.management.entity.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CourseService {


    @Autowired
    private CourseDAO courseDAO;

    public List<Course> Allcourses(){
    
        return courseDAO.allcourses();
    }
    }
