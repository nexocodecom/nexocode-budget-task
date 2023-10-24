package com.nexocode.budget.example;

import com.nexocode.budget.TestContainersConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatusCode;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestContainersConfiguration.class)
class ExampleControllerTest {

    @Autowired
    ExampleRepository exampleRepository;

    @Autowired
    TestRestTemplate restTemplate;

    @BeforeEach
    void cleanUp() {
        exampleRepository.deleteAll();
    }

    @Test
    void returnsExampleById() {
        exampleRepository.save(new Example("id-123", 1));

        Example response = restTemplate.getForObject("/example/id-123", Example.class);

        assertThat(response).isEqualTo(new Example("id-123", 1));
    }

    @Test
    void createsExample() {
        Example response = restTemplate.postForObject("/example", new ExampleDto(50), Example.class);

        assertThat(response.id()).isNotNull();
        assertThat(response.value()).isEqualTo(50);
    }

    @Test
    void validatesCreateExampleRequest() {
        var response = restTemplate.postForEntity("/example", new ExampleDto(-1), Object.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(400));
    }
}