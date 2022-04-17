import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char grade;

        System.out.println("Enter your grade!");
        grade=scan.next().charAt(0);

        switch(grade){
            case 'A' | 'a':
                System.out.println("Great Job!");
                break;
            case 'B' | 'b':
                System.out.println("Good Job!");
                break;
            case 'C' | 'c':
                System.out.println("You can do better.");
                break;
            case 'D' | 'd' :
                System.out.println("You are getting pretty close to Failing");
                break;
            case 'F' | 'f' :
                System.out.println("You are failing the course.");
                break;

            default:
                System.out.println("You have entered an invalid grade!!!!");
        }

    }
}
