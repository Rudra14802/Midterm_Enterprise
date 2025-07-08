package com.example.demo.service;

import com.example.demo.model.Savings;
import com.example.demo.repository.SavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingsService {

    @Autowired
    private SavingsRepository savingsRepository;

    public Mono<Savings> createSavings(Savings savings) {
        return savingsRepository.save(savings);
    }

    public Flux<Savings> getAllSavings() {
        return savingsRepository.findAll();
    }

    public Mono<Void> deleteSavingsById(String id) {
        return savingsRepository.deleteById(id);
    }
}
