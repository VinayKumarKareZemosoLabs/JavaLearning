import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        int divider = fullName.indexOf(" ");

        String firstName = fullName.substring(0, divider);
        String lastName= fullName.substring(divider+1);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
    }
}
