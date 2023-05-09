package com.myapp.springmvcsecurityuserregistration.controller;


import com.myapp.springmvcsecurityuserregistration.service.UserService;
import com.myapp.springmvcsecurityuserregistration.user.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private Logger logger = Logger.getLogger(getClass().getName());

    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showRegistrationForm")
    public String showMyLoginPage(Model theModel) {
        theModel.addAttribute("webUser", new WebUser());
        return "register/registration-form";
    }
}































