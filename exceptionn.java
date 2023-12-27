// Write a small program where you handle an exception of your choice.(except arithmetic)
//  * --->Include user input, this should create the exception.\
//  * --->Print the exception message to show that the exception has been caught.
//  * --->Identify the exception handling keywords that you used and why.
//  * --->Create the customized exception for the same code.


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exceptionn {
    public static void main(String[] args) {
        processInput();
    }

    static void processInput() {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number (only even numbers are allowed): ");
            int userInput = scanner.nextInt();

            if (userInput % 2 != 0) {
                throw new CustomException("Invalid input! Please enter an even number.");
            } else {
                System.out.println("You entered: " + userInput);
            }
        } catch (CustomException ce) {
            System.out.println("Custom Exception Caught: " + ce.getMessage());
        } 
    }
}
