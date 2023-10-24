package com.nexocode.budget;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainersConfiguration.class)
class BudgetApplicationTests {
    @Test
    void contextLoads() {
    }
}
