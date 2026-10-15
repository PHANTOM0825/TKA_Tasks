public class VehicleServiceBillCalculator {

    public static double calculateSparePartsGST(double a, double b) {
        double total = a + b;
        return total + (total * 0.18);
    }

    public static double calculateLaborGST(double c, double d) {
        double total = c + d;
        return total + (total * 0.18);
    }

    public static double calculateConsumablesGST(double e) {
        return e + (e * 0.12);
    }

    public static double totalBill(double a, double b, double c, double d, double e) {
        return calculateSparePartsGST(a, b) + calculateLaborGST(c, d) + calculateConsumablesGST(e);
    }

    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.15;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        System.out.println("Spare Parts with GST: " + calculateSparePartsGST(a, b));
        System.out.println("Labor Charges with GST: " + calculateLaborGST(c, d));
        System.out.println("Consumables with GST: " + calculateConsumablesGST(e));
        System.out.println("Total Bill: " + totalBill(a, b, c, d, e));
        System.out.println("Final Payable Amount: " + calculateDiscountedBill(a, b, c, d, e));
    }
}
