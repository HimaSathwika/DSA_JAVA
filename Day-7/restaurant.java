package oops;
class FoodItem {
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

class DineIn extends FoodItem {
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

class Takeaway extends FoodItem {
    double packingCharge;
    double subtotal, gst, discount, total;

    public void setPackingCharge(double charge) {
        packingCharge = charge;
    }

    @Override
    public void calculateBill() {
        subtotal = unitPrice * quantity + packingCharge;
        gst = subtotal * 0.05;
        discount = (subtotal + gst) > 1000 ? (subtotal + gst) * 0.10 : 0;
        total = subtotal + gst - discount;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFood Item Record (Takeaway)");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

class Delivery extends FoodItem {
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

public class restaurant {
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
