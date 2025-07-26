package java_projects.restaurant_pro;

public class Main {
    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];

        DineIn dine = new DineIn();
        dine.setItemDetails("F101", "Paneer Butter Masala", 250.0, 4);
        dine.setServiceCharge(50);
        dine.calculateBill();
        orders[0] = dine;

        Takeaway take = new Takeaway();
        take.setItemDetails("F102", "Veg Biryani", 180.0, 2);
        take.setPackingCharge(20);
        take.calculateBill();
        orders[1] = take;

        Delivery delivery = new Delivery();
        delivery.setItemDetails("F103", "Chicken Pizza", 300.0, 4);
        delivery.setDeliveryFee(40);
        delivery.calculateBill();
        orders[2] = delivery;

        for (FoodItem item : orders) {
            item.displayDetails(); 
        }
    }
}
