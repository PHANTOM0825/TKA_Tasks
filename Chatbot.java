import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Cab Booking Chatbot ---");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine().trim();

            if (choice.equals("1")) {
                System.out.println("\nSelect Cab Type:");
                System.out.println("1. Auto (Rs 12/km)");
                System.out.println("2. Sedan (Rs 18/km)");
                System.out.println("3. SUV (Rs 25/km)");
                System.out.print("Enter cab option: ");
                String cabChoice = sc.nextLine().trim();

                String cabType = "";
                int rate = 0;

                if (cabChoice.equals("1")) {
                    cabType = "Auto";
                    rate = 12;
                } else if (cabChoice.equals("2")) {
                    cabType = "Sedan";
                    rate = 18;
                } else if (cabChoice.equals("3")) {
                    cabType = "SUV";
                    rate = 25;
                } else {
                    System.out.println("Invalid cab choice! Returning to main menu.");
                    continue;
                }

                System.out.println("\nSelect Route:");
                System.out.println("1. Pune Station to Shivajinagar (5 km)");
                System.out.println("2. Swargate to Kothrud (8 km)");
                System.out.println("3. Hinjawadi to Wakad (10 km)");
                System.out.print("Enter route option: ");
                String routeChoice = sc.nextLine().trim();

                String source = "";
                String dest = "";
                int km = 0;

                if (routeChoice.equals("1")) {
                    source = "Pune Station";
                    dest = "Shivajinagar";
                    km = 5;
                } else if (routeChoice.equals("2")) {
                    source = "Swargate";
                    dest = "Kothrud";
                    km = 8;
                } else if (routeChoice.equals("3")) {
                    source = "Hinjawadi";
                    dest = "Wakad";
                    km = 10;
                } else {
                    System.out.println("Invalid route choice! Returning to main menu.");
                    continue;
                }

                int totalFare = km * rate;

                System.out.println("\n--- Booking Summary ---");
                System.out.println("Cab Type: " + cabType);
                System.out.println("Source: " + source);
                System.out.println("Destination: " + dest);
                System.out.println("Distance: " + km + " km");
                System.out.println("Rate: Rs " + rate + "/km");
                System.out.println("Total Fare: Rs " + totalFare);

                System.out.println("\n1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter choice: ");
                String confirmChoice = sc.nextLine().trim();

                if (confirmChoice.equals("1")) {
                    int otp = 4582;
                    System.out.println("\nBooking Confirmed!");
                    System.out.println("Your 4-digit OTP is: " + otp);
                    System.out.println("Note: Once OTP is shared, ride cannot be cancelled.");
                } else if (confirmChoice.equals("2")) {
                    System.out.println("\nRide cancelled successfully.");
                } else {
                    System.out.println("\nInvalid choice! Booking cancelled.");
                }

            } else if (choice.equals("2")) {
                System.out.println("Thank you for using Cab Booking Chatbot. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
