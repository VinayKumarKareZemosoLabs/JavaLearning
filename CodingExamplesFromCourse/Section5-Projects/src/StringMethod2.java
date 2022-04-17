import java.util.Locale;

public class StringMethod2 {
    public static void main(String[] args) {
        String myName = "Vinay Kumar Kare";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsM = myName.indexOf("m");

        String lastName = myName.substring(12);

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(whereIsM);
        System.out.println(lastName);

    }
}
