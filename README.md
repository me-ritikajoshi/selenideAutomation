# Selenide Automation Framework

Production-style UI automation suite built with Java, Selenide, TestNG, and Maven.

## Stack

- Java 17+
- Selenide
- TestNG
- Maven

## Project Structure

- `src/test/java/org/test/config/BaseUiTest.java`: shared test configuration + cleanup
- `src/test/java/org/test/*Test.java`: UI test classes
- `src/test/resources/selenide.properties`: default runtime settings
- `pom.xml`: dependencies and Maven build/test plugins

## Run Tests

Run all tests:

```bash
mvn clean test
```

Run a specific test class:

```bash
mvn -Dtest=HomePageSmokeTest test
```

Run with custom runtime options:

```bash
mvn -Dheadless=false -Dbrowser=edge -DtimeoutMs=15000 test
```

## Configuration Priority

1. JVM system properties (`-Dbrowser=...`, `-Dheadless=...`)
2. `BaseUiTest` defaults
3. `src/test/resources/selenide.properties`

## Notes

- The suite closes the browser after each test method to keep tests isolated.
- Test reports/screenshots are written under `build/reports/tests`.
