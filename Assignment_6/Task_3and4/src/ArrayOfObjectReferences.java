public class ArrayOfObjectReferences {

    public static void main(String[] args) {
        Employees[] employees;
        employees = new Employees[2];
        employees[0] = new Employees("Zemoso");
        employees[1] = new Employees("Labs");
    }
}

class Employees{
    Employees(String name){
        System.out.println("Initialization");
        System.out.println(name);
    }
}
/*
 Task 3:
   Create a class with a constructor that takes a String argument. During construction, print the argument.
   Create an array of object references to this class, but don’t actually create objects to assign into the array.
   When you run the program, notice whether the initialization messages from the constructor calls are printed.

 Task 4:
   Complete the previous exercise by creating objects to attach to the array of references.
 */
