import java.util.Scanner;

public class IT24103017Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop for three students
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            // Read the entire line of marks and split by space
            String[] marksInput = scanner.nextLine().split(" ");
            
            // Convert the marks to integers
            int mark1 = Integer.parseInt(marksInput[0]);
            int mark2 = Integer.parseInt(marksInput[1]);
            int mark3 = Integer.parseInt(marksInput[2]);
            int mark4 = Integer.parseInt(marksInput[3]);
            
            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            // Display average
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
            
            System.out.println(); // Print a blank line for spacing between students
        }
        
        scanner.close();
    }
}
