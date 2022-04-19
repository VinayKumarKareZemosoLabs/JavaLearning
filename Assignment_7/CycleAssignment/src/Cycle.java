public class Cycle {

//    public void balance() {
//        System.out.println("Cycle requires balancing");
//    }
//
//    public void motor(){
//        System.out.println("Cycle does not require any motor, but you can add as per need.");
//    }

//    public static void main(String[] args) {
//        Unicycle unicycle = new Unicycle();
//        Bicycle bicycle = new Bicycle();
//        Tricycle tricycle = new Tricycle();
//
//        Cycle cycle = (Cycle) new Unicycle(); //Upcasting
//        cycle.motor();
//
////        Rodent[] rodent = new Rodent[]{ new Gerbil(), new Hamster(), new Mouse()};
////
////        for(Rodent rod : rodent){
////            rod.teeth();
////            rod.bodyCharacteristics();
//
//        Cycle[] arrCycle = new Cycle[]{new Bicycle(), new Unicycle(), new Tricycle()};
//        for(Cycle c : arrCycle){
//            c.motor();;
//            c.balance();
//        }
//
//
//
//       // cycle.balance(); //
//
//        //Cycle newUpcasting = new Bicycle();
//
//       // Bicycle newBycle = (Bicycle) newUpcasting;
//
//
//    }


    public static void main(String[] args) {

        //Down casting

        Cycle obj;
        obj = new Bicycle();
        //obj.balance();         //can't find balance() method b in Cycle
        obj = new Tricycle();
        // obj.balance();           //can't find balance() method in Cycle
        obj = new Unicycle();
        //obj.balance();         //can't find balance() method in Cycle

        Unicycle unicycle = new Unicycle();
        unicycle.balance();

        Tricycle tricycle = new Tricycle();
        // tricycle.balance();    //cannot find method balance in tricycle;

        Bicycle bicycle = new Bicycle();
        bicycle.balance();


        //Up casting

//        Bicycle newB = (Bicycle) new Cycle(); //Cycle cannot be cast to Bicycle
//        newB.balance();


    }

}
