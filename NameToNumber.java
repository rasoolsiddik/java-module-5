import java.util.Scanner;

public class NameToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);
            System.out.println("First three characters: " + firstThree);

            int number = Integer.parseInt(firstThree);
            System.out.println("Converted number: " + number);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must contain at least 3 characters!");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters cannot be converted to an integer!");
        }
    }
}
