public class HotelBillCalculator {

    public static double calculateRoomGST(double a, double b) {
        double total = a + b;
        return total + (total * 0.18);
    }

    public static double calculateDiningGST(double c, double d) {
        double total = c + d;
        return total + (total * 0.05);
    }

    public static double calculateServiceGST(double e) {
        return e + (e * 0.12);
    }

    public static double totalBill(double a, double b, double c, double d, double e) {
        return calculateRoomGST(a, b) + calculateDiningGST(c, d) + calculateServiceGST(e);
    }

    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        System.out.println("Room Charges with GST: " + calculateRoomGST(a, b));
        System.out.println("Dining Charges with GST: " + calculateDiningGST(c, d));
        System.out.println("Service Charges with GST: " + calculateServiceGST(e));
        System.out.println("Total Bill: " + totalBill(a, b, c, d, e));
        System.out.println("Final Payable Amount: " + calculateDiscountedBill(a, b, c, d, e));
    }
}
