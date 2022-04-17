import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        double realNumberOne,realNumberTwo,realNumberThree;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter real number 1");
        realNumberOne=keyboard.nextDouble();

        System.out.println("Enter real number 2");
        realNumberTwo=keyboard.nextDouble();

        System.out.println("Enter real number 3");
        realNumberThree=keyboard.nextDouble();

        double averageOfThree= (realNumberOne+realNumberTwo+realNumberThree)/3.0;

        System.out.println("Avarage of three real numbers are: "+averageOfThree);


    }
}
