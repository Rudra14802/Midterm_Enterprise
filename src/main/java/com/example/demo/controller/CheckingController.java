package com.example.demo.controller;

import com.example.demo.model.Checking;
import com.example.demo.service.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/checkings")
public class CheckingController {

    @Autowired
    private CheckingService checkingService; 

    @GetMapping
    public Flux<Checking> getAllCheckings() {
        return checkingService.getAllCheckings();
    }

    @PostMapping
    public Mono<Checking> addChecking(@RequestBody Checking checking) {
        return checkingService.createChecking(checking); 
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteChecking(@PathVariable String id) {
        return checkingService.deleteCheckingById(id); 
    }
}
