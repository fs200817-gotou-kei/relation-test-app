package com.gotoukei.relationtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gotoukei.relationtest.models.Estimate;

public interface EstimateRepository extends JpaRepository<Estimate, Integer> {

}
