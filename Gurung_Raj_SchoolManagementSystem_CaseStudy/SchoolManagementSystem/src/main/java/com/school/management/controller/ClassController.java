package com.school.management.controller;

import com.school.management.dao.ClassDAO;
import com.school.management.dao.UserDAO;
import com.school.management.entity.Classs;
import com.school.management.entity.User;
import com.school.management.form.CreateClassForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller  
public class ClassController {

    @Autowired
    private UserDAO userDao;

    @Autowired
    private ClassDAO classDAO;
//localhost:8080/class
    @RequestMapping(value = "/class", method = RequestMethod.GET)
    public ModelAndView createClassPage() {
        ModelAndView result = new ModelAndView("class/classUpdate");
        result.addObject("form", new CreateClassForm());
        
        return result;
    }

    @RequestMapping(value = "/classDisplay", method = RequestMethod.GET)
    public ModelAndView search1() {
        ModelAndView response = new ModelAndView();
        response.setViewName("class/classesDisplay");
        List<Classs> classses = new ArrayList<Classs>();

        classses = classDAO.findAll();
        classses.forEach(
                (n)->System.out.println(n.toString())
        );
        response.addObject("classes", classses);
        response.addObject("search", "yes");
        return response;
    }


    @Transactional
    @RequestMapping(value = "/deleteclasses", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam(required = false) int id) {
        ModelAndView response = new ModelAndView();
        response.setViewName("class/classesDisplay");
        classDAO.removeClasssById(id);

        List<Classs> classses = new ArrayList<Classs>();

        classses = classDAO.findAll();
        classses.forEach(
                (n)->System.out.println(n.toString())
        );
        response.addObject("classes", classses);
        response.addObject("search", id);

        return response;
    }
    @RequestMapping(value = "/class", method = RequestMethod.POST)
    public ModelAndView createsms(@Valid CreateClassForm form, BindingResult bindingResult) throws Exception {
        ModelAndView result = new ModelAndView("class/classUpdate");

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
        Classs aClasss = new Classs();
        System.out.println(form);  // 
        
        aClasss.setClass_name(form.getClass_name());
        aClasss.setDescription(form.getDescription());

        user = userDao.findByEmail(getUserEmail());

        Set<Classs> classses = new HashSet<Classs>();
        classses.add(aClasss);
        user.setClassses(classses);

        classDAO.save(aClasss);
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
