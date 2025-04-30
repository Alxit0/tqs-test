# QA Manual – Draft (Iteration 1)

## 1. Purpose

This document outlines the Quality Assurance (QA) strategy for the development of the electric vehicle charging platform. It defines the testing approach, tools, acceptance criteria standards, and QA responsibilities throughout the software development lifecycle.

## 2. QA Tools

| Type of Testing        | Description                                                  | Tool(s)                         |
|------------------------|--------------------------------------------------------------|---------------------------------|
| Unit Testing           | Test core business logic at class/method level               | JUnit, Mockito                  |
| Integration Testing    | Verify interactions between services/components              | REST Assured, Testcontainers    |
| Acceptance Testing     | Validate stories via BDD scenarios                           | Cucumber / Gherkin (optional)   |
| Static Code Analysis   | Analyze code for quality, bugs, security                     | SonarQube, SpotBugs             |
| Code Coverage          | Track % of code covered by tests                             | JaCoCo                          |
| Security Testing       | Scan for vulnerabilities in code/dependencies                | OWASP ZAP					      |
| Performance Testing    | Stress/load test critical endpoints                          | K6                              |

## 3. CI/CD

The CI pipeline must execute the following QA steps automatically:

- Compile and build the project
- Run unit tests (JUnit)
- Calculate code coverage (JaCoCo)
- Trigger static analysis (SonarQube)
- Run integration tests (if flagged)
- Display pass/fail status in PR/MR

## 4. Tools Setup (as of Iteration 1)

| Category           | Tool                  |
|--------------------|-----------------------|
| Unit testing       | JUnit                 |
| Coverage           | JaCoCo                |
| Static analysis    | SonarQube             |
| CI integration     | GitHub Actions        |

## 5. TODO

- [x] Draft QA Manual
- [x] QA strategy & tools selected
- [x] Collaborated on story acceptance criteria
- [ ] CI pipeline integration started
- [ ] SonarQube and coverage config in progress