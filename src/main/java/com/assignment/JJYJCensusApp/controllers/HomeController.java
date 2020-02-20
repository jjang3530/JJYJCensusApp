package com.assignment.JJYJCensusApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }

    @GetMapping("/goToKeyword")
    public String goToKeyword(){
        System.out.println("going to JJYJFindGeoAreaByKeyword page");
        return "JJYJFindGeoAreaByKeyword";
    }

    @GetMapping("/goToLevel")
    public String goToLevel(){
        System.out.println("going to JJYJFindGeoAreaByLevel page");
        return "JJYJFindGeoAreaByLevel";
    }

    @GetMapping("/goToDetails")
    public String goToDetails(){
        System.out.println("going to JJYJGeoAreaDetails page");
        return "JJYJGeoAreaDetails";
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }

 }
