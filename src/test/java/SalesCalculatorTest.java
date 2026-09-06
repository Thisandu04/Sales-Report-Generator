import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class SalesCalculatorTest {
    private SalesCalculator calculator;

    @BeforeEach
    public void setUp() {
        List<Product> mockProducts = Arrays.asList(
                new Product("P001", "Mouse", "Electronics", 10, 25.00),
                new Product("P002", "Pen", "Stationery", 100, 1.00),
                new Product("P003", "Keyboard", "Electronics", 5, 50.00)
        );
        calculator = new SalesCalculator(mockProducts);
    }

    @Test
    public void testTotalRevenuePerProduct() {
        assertEquals(250.00, calculator.getProducts().get(0).getTotalRevenue());
    }

    @Test
    public void testGrandTotalRevenue() {
        assertEquals(600.00, calculator.getGrandTotalRevenue());
    }

    @Test
    public void testBestSellingProduct() {
        Product bestSeller = calculator.getBestSellingProduct();
        assertEquals("P002", bestSeller.getId());
    }
}