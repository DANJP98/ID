import java.util.Scanner;

public class DigitsCheck {
    public static String digitsCheck() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID (up to 9 Digits): ");
        String id = in.nextLine();

        while (!id.matches("\\d+")) {
            System.out.print("Invalid input! Enter only numbers: ");
            id = in.nextLine();
        }

        if (id.length() > 9) {
            id = id.substring(id.length() - 9);
        }

        while (id.length() < 9) {
            id = "0" + id;
        }

        return id;
    }
}

