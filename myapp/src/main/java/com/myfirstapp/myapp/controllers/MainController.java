package com.myfirstapp.myapp.controllers;

import com.myfirstapp.myapp.Models.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    EmployeesRepo employeesRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("events", employeesRepo.findAll());
        return mv;
    }


}



