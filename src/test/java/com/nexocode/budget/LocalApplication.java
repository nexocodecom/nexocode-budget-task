package com.nexocode.budget;

import org.springframework.boot.SpringApplication;

public class LocalApplication {
    public static void main(String[] args) {
        SpringApplication.from(BudgetApplication::main)
                .with(TestContainersConfiguration.class)
                .run(args);
    }
}
