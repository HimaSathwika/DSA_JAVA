package java_projects.restaurant_pro;

public class FoodItem {
    String itemId;
    String itemName;
    double unitPrice;
    int quantity;

    public void setItemDetails(String id, String name, double price, int qty) {
        itemId = id;
        itemName = name;
        unitPrice = price;
        quantity = qty;
    }

    public void calculateBill() {}

    public void displayDetails() {}
}
