import java.util.Scanner;

public class Proj4_1_Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 integers");


        for(int i=0; i<5; i++){
            arr[i]=scan.nextInt();
        }

        for(int i=0 ; i<5; i++){
            System.out.println(arr[i]*2);
        }


    }



}
