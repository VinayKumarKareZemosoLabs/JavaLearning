import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number;
        System.out.println("Enter an integer to check wheather it is divisible by 3 or not.");

        number = scan.nextLine();

        int digitSum=0;

        for(int i=0; i<number.length(); i++){
            digitSum += number.charAt(i)-'0';
        }
        if(digitSum%3==0){
            System.out.println(number + " is divisible by 3");
        }
        else System.out.println(number + " is NOT  divisible by 3");



    }
}
