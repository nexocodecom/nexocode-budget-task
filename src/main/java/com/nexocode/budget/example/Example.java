package com.nexocode.budget.example;

import org.springframework.data.annotation.TypeAlias;

@TypeAlias("example")
public record Example(String id, Integer value) {
    public Example(Integer value) {
        this(null, value);
    }
}