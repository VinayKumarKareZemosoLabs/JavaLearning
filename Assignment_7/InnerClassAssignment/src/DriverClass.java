public class DriverClass {
    public static void main(String[] args) {
        SubClass.SubInnerClass ref = new SubClass().new SubInnerClass("ZemosoLabs");
        System.out.println(ref.getClass().toString());
    }
}
