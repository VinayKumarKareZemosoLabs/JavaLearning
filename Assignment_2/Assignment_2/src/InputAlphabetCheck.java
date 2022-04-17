import java.util.Locale;
import java.util.Scanner;

public class InputAlphabetCheck {

    public static boolean checkStringForAllLetterOFAlphabet(String input) {

        input = input.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "");

        if (input.length()==26){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {

        InputAlphabetCheck ref = new InputAlphabetCheck();

        String stringInput;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        stringInput = in.nextLine();

        boolean flag = ref.checkStringForAllLetterOFAlphabet(stringInput);

        if (flag == true)
            System.out.print("\nThe given string contains all the alphabets form a to z.\n ");
        else
            System.out.print("\nThe given string does not contain all the alphabets from a to z.\n ");

/*
*       Time and Space complexity of REGEX solution:
*           ->Regular expression against a string is indeed O(n), but can require up to O(2^m) construction time/space (where m = regular expression size).
*
*
* */


    }

}
