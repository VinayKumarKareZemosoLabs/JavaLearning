import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {

    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;

        final int NUM_Names = 5;

        for(int i=0; i<NUM_Names; i++){
            System.out.println("Please enter name " +
                    i + "\t");
            fullName=scan.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace+1);

            firstNames.add(firstName);
            lastNames.add(lastName);



        }

        for (int i = 0; i<firstNames.size(); i++){
            for(int j=0; j<lastNames.size(); j++){
                System.out.print(firstNames.get(i)+ " ");
                System.out.println(lastNames.get(j));
            }
        }

    }
}
