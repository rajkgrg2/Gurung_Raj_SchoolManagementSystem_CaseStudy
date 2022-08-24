package com.school.management.controller;


import com.school.management.dao.UserDAO;
import com.school.management.dao.VolunteerDAO;
import com.school.management.entity.User;
import com.school.management.entity.Volunteer;
import com.school.management.form.CreateVolunteerForm;
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
public class VolunteerController {

    @Autowired
    private UserDAO userDao;

    @Autowired
    private VolunteerDAO volunteerDAO;

    @RequestMapping(value = "/volunteer", method = RequestMethod.GET)
    public ModelAndView createRecipePage() {
        ModelAndView result = new ModelAndView("volunteer/volunteerUpdate");
        result.addObject("form", new CreateVolunteerForm());
        User user = userDao.findByEmail(getUserEmail());
        Volunteer volunteer =  volunteerDAO.findById(user.getId());

        result.addObject("volunteer", volunteer);
        return result;
    }


    @RequestMapping(value = "/volunteer", method = RequestMethod.POST)
    public ModelAndView createRecipeSumit(@Valid CreateVolunteerForm form, BindingResult bindingResult) throws Exception {
        ModelAndView result = new ModelAndView("volunteer/volunteerUpdate");

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
        Volunteer volunteer = new Volunteer();
     
        volunteer.setFirstName(form.getFirst_name());
        volunteer.setLastName(form.getLast_name());
        volunteer.setTitle(form.getTitle());
        volunteer.setCity(form.getCity());
        volunteer.setCountry(form.getCountry());
        user = userDao.findByEmail(getUserEmail());
        volunteer.setId(user.getId());
        volunteerDAO.save(volunteer);

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
