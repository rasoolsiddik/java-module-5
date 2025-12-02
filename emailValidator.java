class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter email: ");
            String email = sc.nextLine();

            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid email! Missing '@' symbol.");
            }

            System.out.println("Valid email.");

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
