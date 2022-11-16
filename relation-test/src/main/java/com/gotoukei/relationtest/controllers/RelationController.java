package com.gotoukei.relationtest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gotoukei.relationtest.models.Estimate;
import com.gotoukei.relationtest.services.EstimateService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("")
public class RelationController {

    @Autowired
    private EstimateService estimateService;

    @GetMapping("")
    public List<Estimate> getAllEstimates() {
        System.out.println("OK");
        List<Estimate> estimates = this.estimateService.getAllEstimates();
        System.out.println(estimates.toString());
        return estimates;
    }
}
