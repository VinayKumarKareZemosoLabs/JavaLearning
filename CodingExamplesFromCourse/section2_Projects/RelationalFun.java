public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool=false;

        int myAge=22;
        int yourAge=27;
        int bobsAge=20;

        System.out.println("myBool is "+myBool);
        System.out.println("yourBool is "+yourBool);

        //relationl operators
        boolean ageComparison = myAge > yourAge;
        System.out.println(ageComparison);

        ageComparison = yourAge>bobsAge;

        System.out.println(ageComparison);

        ageComparison = yourAge==bobsAge;

        System.out.println(ageComparison);

        int currentAge=22;
        System.out.println(currentAge>=21);

    }
}
