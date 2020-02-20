package com.assignment.JJYJCensusApp.controllers;

import com.assignment.JJYJCensusApp.beans.Geographicarea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

//    @Autowired
//    private ProductRepository productRepository;

    @GetMapping("/keywordsearch")
    public String search(@RequestParam("jj_keyword") String search, Model model){
        System.out.println("in search controller");
        System.out.println("search criteria: "+search);

        List<Geographicarea> products = new ArrayList<>();
        products = com.assignment.JJYJCensusApp.DAL.GeoareaDB.selectProductsByName(search);
        model.addAttribute("JJ_productlist", products);
        return "JJYJFindGeoAreaByKeyword";
    }

}
