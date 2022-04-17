import java.util.Random;

public class RandonFun {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber;
        randomNumber=random.nextInt();
        System.out.println(randomNumber);

        randomNumber = random.nextInt(1000);// 0 - 999

        System.out.println("0 to 999 "+ randomNumber);

        randomNumber = random.nextInt(1000)+1; //0-1000
        System.out.println("0 to 1000 "+randomNumber);


    }
}
