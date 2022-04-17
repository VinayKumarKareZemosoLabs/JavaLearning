import java.util.ArrayList;

public class WrapperFun {

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(10);
        myArrayList.add(25);

        for(int i: myArrayList){
            System.out.println(i);
        }

        String pi = "3.14159";
        double doublePI = Double.parseDouble(pi);
        System.out.println(doublePI);

    }
}
