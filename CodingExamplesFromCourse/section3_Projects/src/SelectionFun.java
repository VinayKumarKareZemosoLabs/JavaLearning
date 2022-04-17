import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        System.out.println("Welcome to the Pub and Grill.");

        System.out.println("Please enter your age");

        age=scan.nextInt();

        if(age>=21){
            System.out.println("You can have a bear!");
        }

        else if (age>=16){
            System.out.println("You can have a coke!");
            System.out.println("You can drive a vehicle");
        }
        else{
            System.out.println("you can have coke!");
        }


    }
}
