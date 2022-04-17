import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age; char gender;

        System.out.print("Enter your age:");
        age= scan.nextInt();
        System.out.print("Enter your gender(M or F):");
        gender=scan.next().charAt(0);

        if(age>=19 && (gender=='M')){
            System.out.println("You are eligible to join Organization");
        }
        else System.out.println("You are not eligible to join!!");
    }
}
