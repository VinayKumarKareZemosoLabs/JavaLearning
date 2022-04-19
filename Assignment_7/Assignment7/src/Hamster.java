public class Hamster extends Rodent{

    Hamster(){
        System.out.println("Hi, i'm Hamster.");
    }

    @Override
    public void bodyCharacteristics() {
        System.out.println("I have a short tail and and lot of fur, I am round in shape and has larger ears than gerbil");
    }

    @Override
    public void teeth() {
        //super.teeth();
        System.out.println("Harmster also don't have canine teeth!");
    }
}
