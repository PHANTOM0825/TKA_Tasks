import java.util.Scanner;

public class ShoppingBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int count = sc.nextInt();

        double subtotal = 0;
        double totalTax = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("\nItem " + i + ":");
            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            double itemTotal = price * qty;
            subtotal = subtotal + itemTotal;

            System.out.println("1. Electronics (18% GST)");
            System.out.println("2. Fashion (13% GST)");
            System.out.println("3. Food (7% GST)");
            System.out.print("Choose category (1-3): ");
            int choice = sc.nextInt();

            double taxRate = 0;
            if (choice == 1) {
                taxRate = 0.18;
            } else if (choice == 2) {
                taxRate = 0.13;
            } else if (choice == 3) {
                taxRate = 0.07;
            }

            totalTax = totalTax + (itemTotal * taxRate);
        }

        double discount = subtotal * 0.20;
        double finalBill = subtotal - discount + totalTax;

        System.out.println("\n--- BILL RECEIPT ---");
        System.out.println("Subtotal: Rs. " + subtotal);
        System.out.println("Discount (20%): -Rs. " + discount);
        System.out.println("Total Tax: Rs. " + totalTax);
        System.out.println("Final Bill: Rs. " + finalBill);

        sc.close();
    }
}
