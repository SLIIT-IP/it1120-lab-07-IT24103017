public class IT24103017Lab7Q2B {
    public static void main(String[] args) {
        // Loop through numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Display the number
            System.out.print(i + " - ");
            
            // Loop to print the stars based on the number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
