package vinaykumarkare.assignment;

public class Data {
    public int age;
    public char initialLetter;

    public void printDetails(){
        System.out.println("Age :" +age);
        System.out.println("initialLetter: "+initialLetter);
    }

    public void localVariable(){
        int ageLocalScope;
        int initialLetterLocalScope;

        /*

        System.out.println("Age :" +ageLocalScope);
        System.out.println("initialLetter: "+initialLetterLocalScope);

        Explanation:
        -> The above code will not because local variables must be initialized before
        using them.
        -> The instance/ non- static variables will work because they will be initialed
        with some default value by compiler automatically, but local variables isn't
        initialized by compiler, it should be done by user itself.


        */



    }
}
