
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GenerateVampireNumbers {

    public static void main(String[] args) {

        GenerateFirst100VampireNumbers();

    }

    static void GenerateFirst100VampireNumbers() {

        int count = 0;

        StringBuilder res = new StringBuilder();

        for (int i = 10; i <= 1000; i++) {
            for (int j = i; j <= 1000; j++) {

                if (isVampireNumber(i, j,true)) {

                    count++;
                    if(count<=100){
                        System.out.println(count + " : "+i*j + " (" + i + " " +j + ")");
                    }
                    else break;
                }
            }
        }
    }




    static boolean isVampireNumber(int a, int b, boolean noPseudoVamireNumbers ) {


        if (noPseudoVamireNumbers) {
            if (a * 10 <= b || b * 10 <= a) {
                return false;
            }
        }

        String mulDigits = splitIntoDigits(a*b,0);
        String faktorDigits = splitIntoDigits(a,b);

        return mulDigits.equals(faktorDigits);
    }



    static String splitIntoDigits(int num1, int num2) {

        StringBuilder res = new StringBuilder();

        ArrayList<Integer> digits = new ArrayList<>();
        while (num1 > 0) {
            digits.add(num1%10);
            num1 /= 10;
        }

        while (num2 > 0) {
            digits.add(num2%10);
            num2/= 10;
        }

        Collections.sort(digits);
        for (int i : digits) {
            res.append(i);
        }


        return res.toString();
    }
}
