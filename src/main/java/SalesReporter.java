public class SalesReporter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java SalesReporter <csv-file-path> <output-method> [output-file-path]");
            System.exit(1);
        }

        String csvFilePath = args[0];
        String outputMethod = args[1].toLowerCase();

        try {

            var products = CsvReader.readProducts(csvFilePath);


            SalesCalculator calculator = new SalesCalculator(products);
            String report = ReportFormatter.format(calculator);


            OutputStrategy strategy;
            if (outputMethod.equals("console")) {
                strategy = new ConsoleOutputStrategy();
            } else if (outputMethod.equals("file")) {
                if (args.length < 3) {
                    throw new IllegalArgumentException("Output file path is required when output-method is 'file'.");
                }
                strategy = new FileOutputStrategy(args[2]);
            } else {
                throw new IllegalArgumentException("Invalid output method. Use 'console' or 'file'.");
            }


            strategy.output(report);

        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: The specified CSV file was not found.");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}