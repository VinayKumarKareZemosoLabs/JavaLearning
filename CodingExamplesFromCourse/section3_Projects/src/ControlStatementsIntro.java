
public class ControlStatementsIntro {

    public static void main(String[] args) {
        int age = 15;
        System.out.println(age);

        if(age>=18){
            System.out.println("You can drive a vehicle!");
        }else{
            System.out.println("No, you cannot drive a vehicle!");
        }

        System.out.println();

        for(int i=0; i<=age; i++){
            System.out.println("Happy birthday "+i);
        }
    }
}
