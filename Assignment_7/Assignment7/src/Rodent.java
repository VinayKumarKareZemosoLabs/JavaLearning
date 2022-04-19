public abstract class Rodent {

    Rodent(){
        System.out.println("Hi, i'm Rodent.");
    }

    public abstract void bodyCharacteristics();
    public void teeth(){
        System.out.println("Rodent don't have canine teeth!");
    }

    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[]{ new Gerbil(), new Hamster(), new Mouse()};

        for(Rodent rod : rodent){
            rod.teeth();
            rod.bodyCharacteristics();
        }
    }
}
