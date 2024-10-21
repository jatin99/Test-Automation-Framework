
# Test Automation Framework

## Overview

This test automation framework is designed to streamline UI testing for web applications. It uses Java 11, TestNG, and Selenium WebDriver for efficient and scalable testing. It also integrates Apache POI, OpenCSV, Gson, and Faker for data-driven testing and data generation. Cloud-based test execution is achieved using LambdaTest, and tests can be run locally or on the cloud using Maven commands.

## Author

- [@jatin99](https://github.com/jatin99)


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/jatin99)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jatinshharma/)


## Features

- **UI Automation** :  Built using Selenium WebDriver.
- **Data-Driven Testing**: Supports reading test data from Excel, CSV, and JSON files.
- **Cloud Integration**: Supports running tests on LambdaTest for cross-browser testing.
- **Headless Execution**: Ability to run tests in headless mode for faster execution.
- **Command-Line Execution**: Easy to run tests from the terminal using Maven.




## Dependencies

-  **Java 11** - The programming language used for writing tests.
 - **Selenium WebDriver** - For automating web browser interaction.
-  **TestNG** - Test framework for organizing and running tests.
-  **Apache POI** - For reading data from Excel files.
-  **OpenCSV** - For reading data from CSV files.
- **Gson** - For parsing JSON data.
- **Faker** - For generating fake test data.
- **LambdaTest** - For running tests on different browsers in the cloud.
- **Maven** - For dependency management and build automation.
- **ExtentReports** - For generating HTML ExtentReports
- **Log4J** - For generating logs for the test execution

## Getting Started
### Prerequisites

Before running the tests, ensure you have the following installed:

- Java 11 or higher
- Maven 3.x Download Link: https://maven.apache.org/download.cgi

## Installation

**Clone the Repo**

```bash
  git clone https://github.com/jatin99/Test-Automation-Framework.git
  cd Test-Automation-Framework
```
**Running the Test on Chrome Browser locally in Headless mode**

```bash
  mvn test -Dbrowser=chrome -DisLambdatest=false -DisHeadless=true
  ```    

  **Running the Test on Firefox on LambdaTest**

```bash
  mvn test -Dbrowser=firefox -DisLambdatest=true -DisHeadless=false
  ```    

## Reports:

Reports are created using Extent Reports.
ReportName is report.html



## Integrated with Github Actions:

THis project is integrated with github actions and the tests are
scheduled to be executed at 11:30PM IST


The tests reports are archived in gh-pages branch
To view the test reports you can visit: 

https://jatin99.github.io/Test-Automation-Framework/report.html
