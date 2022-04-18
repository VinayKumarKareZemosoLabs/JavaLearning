
public class ConstructorOverloading {

    ConstructorOverloading(){
        this("Parameterized Constructor!!!");
        System.out.println("Default Constructor!!");
//        this("Parameterized Constructor!!!");
    }

    ConstructorOverloading(String para){
        System.out.println(para);
        //System.out.println("Parameterized Constructor!!");
    }


    public static void main(String[] args) {
        ConstructorOverloading consOverload = new ConstructorOverloading();


    }

}

//Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one