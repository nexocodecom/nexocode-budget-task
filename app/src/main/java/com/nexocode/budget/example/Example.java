package com.nexocode.budget.example;

import org.springframework.data.annotation.TypeAlias;

@TypeAlias("example")
record Example(String id, Integer value) {
}