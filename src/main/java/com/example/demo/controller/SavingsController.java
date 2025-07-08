package com.example.demo.controller;

import com.example.demo.model.Savings;
import com.example.demo.service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/savings")
public class SavingsController {

    @Autowired
    private SavingsService savingsService;

    @PostMapping
    public Mono<Savings> addSavings(@RequestBody Savings savings) {
        return savingsService.createSavings(savings);
    }

    @GetMapping
    public Flux<Savings> getAllSavings() {
        return savingsService.getAllSavings();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteSavings(@PathVariable String id) {
        return savingsService.deleteSavingsById(id);
    }
}