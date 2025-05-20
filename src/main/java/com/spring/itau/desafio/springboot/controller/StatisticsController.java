package com.spring.itau.desafio.springboot.controller;

import com.spring.itau.desafio.springboot.dto.StatisticsResponse;
import com.spring.itau.desafio.springboot.service.TransactionService;
import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {
    private final TransactionService transactionService;

    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics() {
        DoubleSummaryStatistics stats = transactionService.getStatistics();

        return ResponseEntity.ok(new StatisticsResponse(stats));
    }
}
