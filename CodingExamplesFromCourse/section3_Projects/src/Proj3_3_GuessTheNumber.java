import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

       int randomNumber = random.nextInt(100)+1;



       int guessCount=0;


        boolean guessedNumber = false;
        while(!guessedNumber){
            System.out.println("Enter a integer between 1 and 100");
            int inputNumber= scan.nextInt();

            guessCount++;

            if(inputNumber>=1 || inputNumber<=100){

                if(randomNumber==inputNumber){
                    System.out.println("Congratulations! You guessed the number in "+
                            inputNumber + "guesses! Thanks for Playing!");
                    guessedNumber = true;
                }

                else if (inputNumber<randomNumber){
                    System.out.println("You guess was too low");
                }
                else if (inputNumber>randomNumber){
                    System.out.println("You guess was too high");
                }
            }
            else    System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");


        }


    }
}
