package java_projects.restaurant_pro;

public class Delivery extends FoodItem{
    double deliveryFee;
    double subtotal, gst, discount, total;

    public void setDeliveryFee(double fee) {
        deliveryFee = fee;
    }

    @Override
    public void calculateBill() {
        subtotal = unitPrice * quantity + deliveryFee;
        gst = subtotal * 0.05;
        discount = (subtotal + gst) > 1000 ? (subtotal + gst) * 0.10 : 0;
        total = subtotal + gst - discount;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFood Item Record (Delivery)");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}
