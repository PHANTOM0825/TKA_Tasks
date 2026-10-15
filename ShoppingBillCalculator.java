public class ShoppingBillCalculator {

    public double calculateElectronicsGST(double a, double b) {
        double total = a + b;
        return total + (total * 0.18);
    }

    public double calculateFashionGST(double c, double d) {
        double total = c + d;
        return total + (total * 0.13);
    }

    public double calculateFoodGST(double e) {
        return e + (e * 0.07);
    }

    public double totalBill(double a, double b, double c, double d, double e) {
        return calculateElectronicsGST(a, b) + calculateFashionGST(c, d) + calculateFoodGST(e);
    }

    public double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        return total - discount;
    }

    public static void main(String[] args) {
        ShoppingBillCalculator bill = new ShoppingBillCalculator();

        System.out.println("Electronics GST: " + bill.calculateElectronicsGST(100, 100));
        System.out.println("Fashion GST: " + bill.calculateFashionGST(100, 100));
        System.out.println("Food GST: " + bill.calculateFoodGST(100));
        System.out.println("Total Bill: " + bill.totalBill(100, 100, 100, 100, 100));
        System.out.println("Discounted Final Bill: " + bill.calculateDiscountedBill(100, 100, 100, 100, 100));
    }
}
