import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int learningPackage;
        System.out.println("Enter package number that you have choosen:");
        learningPackage = scan.nextInt();

        int courses;
        System.out.println("Enter the courses that you have choosen in this month:");
        courses=scan.nextInt();

        int totalCost=0;
        switch (learningPackage){
            case 1:
                totalCost=10+((courses-2)*6);
                break;

            case 2:
                totalCost = 12+((courses-4)*4);
                break;

            case 3:
                totalCost = 15+((courses-6)*3);
                break;

            default:
                System.out.println("Package Number is incorrect.");
        }
        System.out.println("Total cost is $"+totalCost);
    }
}
