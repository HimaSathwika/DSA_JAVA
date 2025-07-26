package java_projects.restaurant_pro;

public class DineIn extends FoodItem {
    double serviceCharge;
    double subtotal, gst, discount, total;

    public void setServiceCharge(double charge) {
        serviceCharge = charge;
    }

    @Override
    public void calculateBill() {
        subtotal = unitPrice * quantity + serviceCharge;
        gst = subtotal * 0.05;
        discount = (subtotal + gst) > 1000 ? (subtotal + gst) * 0.10 : 0;
        total = subtotal + gst - discount;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFood Item Record (Dine-In)");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}
