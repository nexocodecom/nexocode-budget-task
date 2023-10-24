package com.nexocode.budget.example;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record ExampleDto(@Min(0) @Max(1000) Integer value) {
}