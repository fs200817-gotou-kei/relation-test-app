package com.gotoukei.relationtest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<List<Estimate>> getAllEstimates() {
        System.out.println("RelationControllerの見積全取得処理を開始");
        return this.estimateService.getAllEstimates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estimate> getEstimateById(@PathVariable int id) {
        return this.estimateService.getEstimateById(id);
    }
}
