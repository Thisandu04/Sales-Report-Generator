# Command-Line Product Sales Report Generator

A robust, object-oriented Java command-line tool that reads daily product sales data from a CSV file, computes key financial metrics and generates a formatted summary report. The report can be output directly to the console or saved to a text file.

## Features
* **CSV Data Parsing:** Safely reads and processes product sales records while handling missing or malformed columns.
* **Financial Calculations:** Computes total revenue per product, revenue per category, best-selling products, and the grand total.
* **Flexible Output:** Uses the Strategy Pattern (SOLID Open-Closed Principle) to seamlessly route output to either the terminal or a `.txt` file.
* **Graceful Error Handling:** Provides clear, user-friendly error messages for missing files or invalid command-line arguments.
* **Automated Testing:** Includes JUnit 5 unit tests to verify the accuracy of the revenue and best-seller calculations.

## Technologies Used
* **Language:** Java (JDK 21 or higher)
* **Build & Dependency Management:** Maven
* **Testing:** JUnit 5

## Project Structure & Team Contributions
This project was built collaboratively, utilizing the Single Responsibility Principle to divide the codebase:

* **Member 1 (Core Logic):** `Product.java`, `SalesCalculator.java`, `ReportFormatter.java`
* **Member 2 (File I/O & Testing):** `CsvReader.java`, `OutputStrategy.java`, `ConsoleOutputStrategy.java`, `FileOutputStrategy.java`, `SalesCalculatorTest.java`
* **Member 3 (Execution & Config):** `SalesReporter.java` (Main CLI), `pom.xml`, `.gitignore`, `sales.csv`

## Prerequisites
To run this project, you must have the following installed:
* [Java Development Kit (JDK) 11+](https://www.oracle.com/java/technologies/downloads/)
* [Apache Maven](https://maven.apache.org/download.cgi)

## Installation & Setup
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Thisandu04/Sales-Report-Generator.git
   cd Sales-Report-Generator
