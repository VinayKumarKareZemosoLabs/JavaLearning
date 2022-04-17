package vinaykumarkare.assignment;

public class Singleton {
    String nameNonStatic;

    static Singleton sMethod(String name){

/*
        nameNonStatic ="Vinay Kumar Kare";
*/

        Singleton ref = new Singleton();

        return ref;
    }

    void printMethod(){
        System.out.println(nameNonStatic);

/*
*     System.out.println(name);
*
*      Explanation:
*       ->The above commented code will not work because, it is a local variable
*          of "printMethod()"
*       ->It has block scope. So, it can't access that variable.
*
*
*
*
*
*
*
*
*
*
* */




    }
}
