public class Product {
    private String id;
    private String name;
    private String category;
    private int quantitySold;
    private double unitPrice;

    public Product(String id, String name, String category, int quantitySold, double unitPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantitySold = quantitySold;
        this.unitPrice = unitPrice;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantitySold() { return quantitySold; }
    public double getUnitPrice() { return unitPrice; }

    public double getTotalRevenue() {
        return quantitySold * unitPrice;
    }
}