public class CsvReader {
    import java.io.*;
import java.util.*;

    public class CsvReader {
        public static List<Product> readProducts(String filePath) throws IOException {
            List<Product> products = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line = br.readLine(); // Skip header
                if (line == null) throw new IOException("CSV file is empty.");

                int rowNumber = 2;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values.length < 5) {
                        throw new IllegalArgumentException("Row " + rowNumber + " has missing columns.");
                    }
                    String id = values[0].trim();
                    String name = values[1].trim();
                    String category = values[2].trim();
                    int qty = Integer.parseInt(values[3].trim());
                    double price = Double.parseDouble(values[4].trim());

                    products.add(new Product(id, name, category, qty, price));
                    rowNumber++;
                }
            }
            return products;;
        }
    }
}
