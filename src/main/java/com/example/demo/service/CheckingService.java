package com.example.demo.service;

import com.example.demo.model.Checking;
import com.example.demo.repository.CheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CheckingService {

    @Autowired
    private CheckingRepository checkingRepository;

    public Mono<Checking> createChecking(Checking checking) {
        return checkingRepository.save(checking);
    }

    public Flux<Checking> getAllCheckings() {
        return checkingRepository.findAll();
    }

    public Mono<Void> deleteCheckingById(String id) {
        return checkingRepository.deleteById(id);
    }
}

