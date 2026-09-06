import java.util.Map;

public class ReportFormatter {
    public static String format(SalesCalculator calculator) {
        StringBuilder sb = new StringBuilder();
        sb.append("====================================================\n");
        sb.append("       PRODUCT SALES SUMMARY REPORT\n");
        sb.append("====================================================\n\n");

        sb.append("--- Revenue Per Product ---\n");
        for (Product p : calculator.getProducts()) {
            sb.append(String.format("%-5s %-18s %-15s $%.2f\n",
                    p.getId(), p.getName(), p.getCategory(), p.getTotalRevenue()));
        }
        sb.append("\n");

        sb.append("--- Revenue Per Category ---\n");
        Map<String, Double> categoryRevenue = calculator.getRevenuePerCategory();
        for (Map.Entry<String, Double> entry : categoryRevenue.entrySet()) {
            sb.append(String.format("%-15s : $%.2f\n", entry.getKey(), entry.getValue()));
        }
        sb.append("\n");

        sb.append("--- Highlights ---\n");
        Product bestSeller = calculator.getBestSellingProduct();
        if (bestSeller != null) {
            sb.append(String.format("Best-Selling Product : %-15s (%d units)\n",
                    bestSeller.getName(), bestSeller.getQuantitySold()));
        }

        Product highestRevenue = calculator.getHighestRevenueProduct();
        if (highestRevenue != null) {
            sb.append(String.format("Highest Revenue      : %-15s ($%.2f)\n",
                    highestRevenue.getName(), highestRevenue.getTotalRevenue()));
        }

        sb.append(String.format("Grand Total Revenue  : $%.2f\n", calculator.getGrandTotalRevenue()));
        sb.append("====================================================\n");

        return sb.toString();
    }
}