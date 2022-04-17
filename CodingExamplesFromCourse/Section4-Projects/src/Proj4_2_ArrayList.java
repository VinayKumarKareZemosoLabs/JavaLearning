import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    //private static boolean nagative;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();

       // boolean negative=false;

        //while(!nagative)

        System.out.println("Enter 0 or more to put in the list or -1 to exit");
        double input;
        input=scan.nextDouble();

        while(input >=0){
            numberList.add(input);
            System.out.println("Enter 0 or more to put in the list or -1 to exit");

            input=scan.nextDouble();

        }

        for(int i = numberList.size()-1; i>=0; i--){
            System.out.println(numberList.get(i));
        }
    }
}
