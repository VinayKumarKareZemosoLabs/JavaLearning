public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay Kumar");

        sb.append(" Kare");
        System.out.println(sb);
        sb.insert(5, " is awesome ");
        System.out.println(sb);

        sb.replace(22,29, "Amazing");
        System.out.println(sb);

        sb.insert(0, "Dr.");
        System.out.println(sb);
    }
}
