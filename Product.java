
class Product {
    private String sku;
    private double priceRetail;
    private double priceCurrent;
    private String productName;
    private String category;

    public Product(String sku, double priceRetail, double priceCurrent, String productName, String category){
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
    }

    public String getSku(){
        return sku;
    }

    public double getBestPrice(){
        return Math.min(priceRetail, priceCurrent);
    }

    @Override
    public String toString(){
        return "SKU: " + sku + ", Product: " + productName + ", Category: " + category + ", Best Price: $" + getBestPrice();
    }
}