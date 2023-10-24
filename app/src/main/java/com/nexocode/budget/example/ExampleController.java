package com.nexocode.budget.example;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
class ExampleController {
    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleController(
            ExampleRepository exampleRepository
    ) {
        this.exampleRepository = exampleRepository;
    }

    @GetMapping("/example/{id}")
    Optional<Example> getExampleById(@PathVariable String id) {
        return exampleRepository.findById(id);
    }

    @PostMapping("/example")
    Example createExample(@Valid @RequestBody ExampleDto exampleDto) {
        return exampleRepository.save(new Example(null, exampleDto.value()));
    }
}

