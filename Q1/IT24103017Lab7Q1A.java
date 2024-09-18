import java.util.Scanner;

public class IT24103017Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store marks
        int mark1, mark2, mark3, mark4;
        double average;

         System.out.println("Enter marks for four subjects: ");
        
        // Input for four subject marks
        System.out.print("Enter Subject Mark 1: ");
        mark1 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        mark2 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        mark3 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        mark4 = scanner.nextInt();

         System.out.println("  ");
        
        // Calculate average
        average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Display the average
        System.out.println("Average is: " + average);
        
        // Determine the grade
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50 && average <= 74) {
            System.out.println("Overall Grade is : Credit");
        } else if (average >= 0 && average <= 49) {
            System.out.println("Overall Grade is : Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        
        scanner.close();
    }
}
