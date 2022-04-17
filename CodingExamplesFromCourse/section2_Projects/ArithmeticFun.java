public class ArithmeticFun {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result=a+b;

        int diff =a-b;
        int product = a*b;
        int quotient = b/a;
        int remainder = b%a;
        System.out.println("Result is "+result);
        System.out.println("Diff is "+diff);
        System.out.println("Product is "+product);
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is "+remainder);

        result +=20;
        System.out.println("Result is "+result);

        result++;
        System.out.println("Result is "+result);

        result *=20;
        System.out.println("Result is "+result);


    }
}
