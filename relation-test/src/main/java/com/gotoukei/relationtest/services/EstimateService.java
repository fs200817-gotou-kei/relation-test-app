package com.gotoukei.relationtest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gotoukei.relationtest.exceptions.NotFoundException;
import com.gotoukei.relationtest.models.Estimate;
import com.gotoukei.relationtest.repositories.EstimateRepository;

@Service
public class EstimateService {

    @Autowired
    private EstimateRepository estimateRepository;

    // 欲しい情報(Statesコード、data、エラーコードとメッセージ)
    // やるべき処理(データ取得、エラー判定、どういうエラーか判定、"欲しい情報"の設定)
    public ResponseEntity<List<Estimate>> getAllEstimates() {
        return ResponseEntity.ok(estimateRepository.findAll());
    }

    public ResponseEntity<Estimate> getEstimateById(int id) {
        return ResponseEntity.ok(estimateRepository.findById(id).orElseThrow(
                () -> new NotFoundException(id + " is not found.")));
    }
}
