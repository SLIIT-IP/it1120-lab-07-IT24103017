public class IT24103017Lab7Q2C {
    public static void main(String[] args) {
        // Loop from 5 to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop to print the number 'i', 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
