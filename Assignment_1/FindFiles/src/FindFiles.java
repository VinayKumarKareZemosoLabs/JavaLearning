
// For input related methods
import java.util.Scanner;

// For file related methods
import java.io.File;

// FindFiles class
public class FindFiles {
    private void findFile() {

        // Scanner Class to take input from user
        Scanner input = new Scanner(System.in);

        // Address of files or folder where to search
        File file = new File("/home/vinaK");

        // String to store the name of the file
        String fileName;

        // Do-while loop to run the program repeatedly
        do {

            // boolean variable to differentiate whether file is found or not
            boolean toggle = false;

            System.out.print("Enter the file/folder name to search:");

            // To take inout from user
            fileName = input.nextLine();

            //list of file is stored in string
            String[] files = file.list();

            // For Loop to check continuously each file or folder
            for (String string : files) {

                // Check and store the file name in variable
                Boolean str1 = fileName.equals(string);

                // If condition to check str1 is true, then execute below statements
                if (str1) {

                    // Setting toggle as true
                    toggle = true;

                    System.out.println("File Found : ");
                    System.out.println(string);

                    // Printing full absolute path of file
                    System.out.println("Full absolute path : " + file.getAbsolutePath() +"/" +string);
                }
            }

            // If file not found
            if (toggle == false) {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while (true);
    }

    //main() method
    public static void main(String[] args) {

        //Creating instance of FindFiles class
        FindFiles obj = new FindFiles();

        //Calling and executing findFile() method
        obj.findFile();
    }
}