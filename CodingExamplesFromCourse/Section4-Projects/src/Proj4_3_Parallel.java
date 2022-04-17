import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String names[] = new String[5];
        int ages[] = new  int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter name:");
            names[i] = scan.nextLine();

            System.out.print("Enter an age:");
            ages[i] = scan.nextInt();
            scan.nextLine();
        }

        for(int i=0; i<5; i++){
            System.out.println(names[i] + " is " + ages[i] +" years old");
        }


    }
}
