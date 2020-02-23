package com.assignment.JJYJCensusApp.controllers;

import com.assignment.JJYJCensusApp.beans.Age;
import com.assignment.JJYJCensusApp.beans.Geographicarea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DetailsController {

    @GetMapping("/Details")
    public String search(@RequestParam("JJYJ_altCode") String search, Model model){
        System.out.println("in search controller");
        System.out.println("search criteria: "+search);

        List<Age> population = new ArrayList<>();
        population = com.assignment.JJYJCensusApp.DAL.GeoareaDB.selectPopulationByAltCode(search);
        model.addAttribute("JJYJ_population", population);

        List<Geographicarea> area = new ArrayList<>();
        area = com.assignment.JJYJCensusApp.DAL.GeoareaDB.selectAreaByAltCode(search);
        model.addAttribute("JJYJ_area", area);


        return "JJYJGeoAreaDetails";
    }

}
