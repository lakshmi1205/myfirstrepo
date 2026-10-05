import java.util.Scanner; // Import the Scanner class to read input

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.util.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read user input
        
        // Use the modulus operator (%) to check the remainder
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        
        scanner.close(); // Good practice to close the scanner
    }
}

