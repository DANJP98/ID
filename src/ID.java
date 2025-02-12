import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id = DigitsCheck.digitsCheck();
        System.out.println("Formatted ID: " + id);

        int sum = 0;
        for (int i = 0; i < id.length(); i++) {
            int digit = Character.getNumericValue(id.charAt(i));

            if (i % 2 != 0) {
                digit *= 2;
            }

            if (digit >= 10) {
                digit = (digit / 10) + (digit % 10);
            }

            sum += digit;
        }

        if (sum % 10 == 0) {
            System.out.println("The ID number is correct");
        } else {
            System.out.println("Error: Invalid number!");
        }
    }
}

