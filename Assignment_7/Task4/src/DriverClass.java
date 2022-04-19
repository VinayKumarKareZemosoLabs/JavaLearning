import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        Cycle cycle;
        CycleFactory cycleFactory = new CycleFactory();

        System.out.println("choose the cycle to build 1.) Unicycle 2.) Bicycle 3.) Tricycle 4.) Quit\n");
        while(true){
            System.out.println();
            System.out.println("Enter choice : 1,2,3 or other to exit");
            option = scanner.nextInt();
            if(option >= 4 || option<=0) break;
            cycle = cycleFactory.buildCycle(option);
            cycle.info();
        }
    }
}
