# Java Selenium E-Commerce Automation

This project is a Java-based automation framework for testing an e-commerce website using Selenium WebDriver and TestNG.

## Prerequisites

- (Java 17)(https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- (Maven)[https://maven.apache.org/download.cgi]
- (Git)[https://git-scm.com/downloads]
- (IntelliJ IDEA)[https://www.jetbrains.com/idea/download/] (or any other Java IDE) (Optional)

## Project Structure

- `src/test/java/com/example/pages/`: Contains page object classes for different pages of the e-commerce website.
- `src/test/java/com/example/tests/`: Contains test classes for executing test cases.
- `pom.xml`: Maven configuration file with project dependencies and plugins.


## Setup
Before cloning the repository, ensure maven is added to environment variables.
https://www.qamadness.com/knowledge-base/how-to-install-maven-and-configure-environment-variables/

1. Clone the repository:
    ```sh
    git clone  https://github.com/Axone-Tech/java-selenium.git
    cd java-selenium
    ```

2. Install the dependencies:
    ```sh
    mvn clean install
    ```

3. Ensure ChromeDriver is installed and available in your system PATH.

## Running Tests

To run the tests, use the following Maven command:
```sh
mvn clean test