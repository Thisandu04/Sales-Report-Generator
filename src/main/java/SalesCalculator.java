import java.util.*;
import java.util.stream.Collectors;

public class SalesCalculator {
    private List<Product> products;

    public SalesCalculator(List<Product> products) {
        this.products = products;
    }

    public double getGrandTotalRevenue() {
        return products.stream().mapToDouble(Product::getTotalRevenue).sum();
    }

    public Map<String, Double> getRevenuePerCategory() {
        return products.stream().collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.summingDouble(Product::getTotalRevenue)
        ));
    }

    public Product getBestSellingProduct() {
        return products.stream()
                .max(Comparator.comparingInt(Product::getQuantitySold))
                .orElse(null);
    }

    public Product getHighestRevenueProduct() {
        return products.stream()
                .max(Comparator.comparingDouble(Product::getTotalRevenue))
                .orElse(null);
    }

    public List<Product> getProducts() {
        return products;
    }
}