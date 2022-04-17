import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        int diceNumber;

        for(int i=1; i<=10; i++){
            diceNumber=random.nextInt(6)+1;
            System.out.println(diceNumber);
        }

    }
}
