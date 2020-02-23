package com.assignment.JJYJCensusApp.controllers;

import com.assignment.JJYJCensusApp.beans.Geographicarea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchKeywordController {

    @GetMapping("/SearchKeyword")
    public String search(@RequestParam("JJYJ_keyword") String search, Model model){
        System.out.println("in search controller");
        System.out.println("search criteria: "+search);

        List<Geographicarea> areas = new ArrayList<>();
        areas = com.assignment.JJYJCensusApp.DAL.GeoareaDB.selectAreasByKeyword(search);
        model.addAttribute("JJYJ_arealist", areas);
        return "JJYJFindGeoAreaByKeyword";
    }

}
