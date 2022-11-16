package com.gotoukei.relationtest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotoukei.relationtest.models.Estimate;
import com.gotoukei.relationtest.repositories.EstimateRepository;

@Service
public class EstimateService {

    @Autowired
    private EstimateRepository estimateRepository;

    public List<Estimate> getAllEstimates() {
        return this.estimateRepository.findAll();
    }
}
