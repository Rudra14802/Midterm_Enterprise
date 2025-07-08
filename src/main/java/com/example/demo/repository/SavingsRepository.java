package com.example.demo.repository;

import com.example.demo.model.*;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> {
}
