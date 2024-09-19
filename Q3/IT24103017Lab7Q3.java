import java.util.Scanner;

public class IT24103017Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05; // 5% discount
        final int NUMBER_OF_CUSTOMERS = 5; // Number of customers
        
        for (int i = 1; i <= NUMBER_OF_CUSTOMERS; i++) {
            System.out.println("Customer " + i + ":");
            
            // Input the total bill amount
            System.out.print("Enter the total bill amount: ");
            double totalBill = scanner.nextDouble();
            
            // Input the mode of payment (C for cash, O for other)
            System.out.print("Enter the mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            // Process payment mode
            if (paymentMode == 'C' || paymentMode == 'c') {
                // Apply discount for cash payments
                double discount = totalBill * DISCOUNT_RATE;
                double amountToPay = totalBill - discount;
                System.out.println("Discount applied: $" + discount);
                System.out.println("Amount to be paid: $" + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payments
                System.out.println("No discount applied.");
                System.out.println("Amount to be paid: $" + totalBill);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid.");
            }
            
            System.out.println(); // Blank line between customers
        }
        
        scanner.close();
    }
}
