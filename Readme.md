## Requirements

- Java 17
- Docker
- IntelliJ Idea (recommended) or any IDE of your choice

## Run application locally

You do not need to install MongoDB locally. Just open `com.nexocode.budget.LocalApplication` and run main() method. It
will run application with testcontainers that starts MongoDB.

## Basic commands

### Run all tests:

```shell
./gradlew clean test
```

You can of course run tests using IntelliJ Idea