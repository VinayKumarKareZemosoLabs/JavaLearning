import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {

        Scanner sacn = new Scanner(System.in);

        System.out.println("Please enter a non-negative number");
        int inputNumber;
        inputNumber= sacn.nextInt();
        int sum=0;

        do{
            sum+=inputNumber;
            System.out.println("Please enter a non-negative number");
            System.out.println("Or enter negative number to exit!!");
            inputNumber= sacn.nextInt();
        }while(inputNumber>=0);

        System.out.println("Sum is "+ sum);

    }
}
