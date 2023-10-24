package com.nexocode.budget.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends MongoRepository<Example, String> {
}