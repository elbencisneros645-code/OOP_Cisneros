/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class Product {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    /**
     *
     * @author User
     */
    private String productId;
    private String productname;
    private String category;
    private double price;
    private int quantity;

    public Product(String productId, String productname, String category, double price, int quantity) {
        this.productId = productId;
        this.productname = productname;
        this.category = category;
        this.price = price;
        this.quantity = quantity;

    }

    public String getProductId() {
        return productId;

    }

    public String getProductname() {
        return productname;

    }

    public String getCategory() {
        return category;
    }

    public double price() {
        return price;
    }

    public int getquantity() {
        return quantity;

    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productname) {
        this.productname = productname;
    }

    public void setCategory(String category) {
        this.category = category;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateInventoryValue() {
        return price * quantity;
    }

    public String getStockStatus() {
        if (quantity == 0) {
            return "Out of Stock";
        } else if (quantity >= 1 && quantity <= 10) {
            return "Low Stock";
        } else if (quantity >= 11 && quantity <= 50) {
            return "Normal Stock";
        } else {
            return "High Stock";
        }
    }

    public void displayProductInfo() {
        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println();
        System.out.println("Product ID: " + productId);
        System.out.println();
        System.out.println("Product Name: " + productname);
        System.out.println();
        System.out.println("Category: " + category);
        System.out.printf("Price: ₱%,.2f%n", price);
        System.out.println();
        System.out.println("Quantity: " + quantity);
        System.out.println();
        System.out.printf("Inventory Value: ₱%,.2f%n",
                calculateInventoryValue());
        System.out.println();
        System.out.println("Stock Status: " + getStockStatus());
    }
}
