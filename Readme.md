## Requirements

- Java 17
- Docker
- IntelliJ Idea (recommended) or any IDE of your choice

## Run application locally

You do not need to install MongoDB locally. Just open `com.nexocode.budget.TestBudgetApplication` and run
`main()` method. You can run it in Debug mode if you need.
It will run application with testcontainers that starts MongoDB.

You can verify if application is running, using curl as mentioned below — `null` value should be returned.

```shell
curl localhost:8080/example/123
```

## Run tests:

You can of course run tests using IntelliJ Idea, but you can also use command line:

```shell
./gradlew clean test
```

