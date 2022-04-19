public class EntendsAndImplemetsClass extends ConcreteClass implements Interface4 {

    @Override
    public void interface1Method1() {
        System.out.println("This is interface 1 method 1");

    }

    @Override
    public void interface1Method2() {
        System.out.println("This is interface 1 method 2");
    }

    @Override
    public void interface2Method1() {
        System.out.println("This is interface 2 method 1");
    }

    @Override
    public void interface2Method2() {
        System.out.println("This is interface 2 method 2");
    }

    @Override
    public void interface3Method1() {
        System.out.println("This is interface 3 method 1");
    }

    @Override
    public void interface3Method2() {
        System.out.println("This is interface 3 method 2");
    }

    @Override
    public void Method() {
        System.out.println("This is interface 4 method()");
    }

    public void method1(Interface1 i){
        i.interface1Method1();
    }

    public void method2(Interface2 i){
        i.interface2Method1();
    }

    public void method3(Interface3 i){
        i.interface3Method1();
    }

    public void method4(Interface4 i){
        i.Method();
    }
}
