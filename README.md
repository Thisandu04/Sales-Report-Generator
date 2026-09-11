# Sales Report Generator

A Java-based application that reads sales data from a CSV file, calculates
sales statistics, generates a formatted report, and outputs the report
either to the console or to a file.

## Features

- Read sales data from a CSV file
- Calculate total revenue
- Calculate average revenue
- Find the best-selling product
- Calculate revenue by category
- Generate formatted sales reports
- Display reports in the console
- Save reports to a file
- JUnit 5 unit testing
- Uses the Strategy Design Pattern for report output

## Technologies Used

- Java 25
- Maven
- JUnit 5
- Git & GitHub

## Project Structure

src/
├── main/
│   ├── java/
│   │   ├── Product.java
│   │   ├── CsvReader.java
│   │   ├── SalesCalculator.java
│   │   ├── ReportFormatter.java
│   │   ├── OutputStrategy.java
│   │   ├── ConsoleOutputStrategy.java
│   │   ├── FileOutputStrategy.java
│   │   └── SalesReporter.java
│   │
│   └── resources/
│
└── test/
    └── java/
        └── SalesCalculatorTest.java

## CSV File Format

The input CSV file should contain the following columns:

id,product,category,quantity,unitPrice

Example:

- 1,Laptop,Electronics,5,1000
- 2,Mouse,Accessories,10,25
- 3,Keyboard,Accessories,7,50
- 4,Monitor,Electronics,4,300

## How to Run

### 1. Clone the repository

git clone https://github.com/Thisandu04/Sales-Report-Generator.git

### 2. Navigate to the project

cd Sales-Report-Generator

### 3. Build the project

mvn clean package

### 4. Run the application

java -cp target/classes SalesReporter <csv-file> <output-mode>

Example:

java -cp target/classes SalesReporter sales.csv console

## Output Modes

### Console Output

Generates the report directly in the terminal.

Example:

- Total Revenue: 7450.00
- Average Revenue: 1862.50
- Best Selling Product: Laptop

### File Output

The generated report can also be saved to a file.

## Running Tests

Run the JUnit 5 tests using:

mvn clean test

## Design Pattern

This project uses the Strategy Design Pattern for report output.

The `OutputStrategy` interface allows different output methods
to be used without changing the main reporting logic.

Current strategies:

- ConsoleOutputStrategy
- FileOutputStrategy

This design makes it easier to add new output methods in the future.

## Error Handling

The application validates the input file and handles errors such as:

- Missing CSV files
- Invalid CSV data
- Invalid numeric values
- Invalid command-line arguments

