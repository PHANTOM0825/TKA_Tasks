public class ShoppingBillCalculator {

    public static double calculateElectronicsGST(double a, double b) {
        double total = a + b;
        return total + (total * 0.18);
    }

    public static double calculateFashionGST(double c, double d) {
        double total = c + d;
        return total + (total * 0.13);
    }

    public static double calculateFoodGST(double e) {
        return e + (e * 0.07);
    }

    public static double totalBill(double a, double b, double c, double d, double e) {
        return calculateElectronicsGST(a, b) + calculateFashionGST(c, d) + calculateFoodGST(e);
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

        System.out.println("Electronics GST: " + calculateElectronicsGST(a, b));
        System.out.println("Fashion GST: " + calculateFashionGST(c, d));
        System.out.println("Food GST: " + calculateFoodGST(e));
        System.out.println("Total Bill: " + totalBill(a, b, c, d, e));
        System.out.println("Final Payable Amount: " + calculateDiscountedBill(a, b, c, d, e));
    }
}
