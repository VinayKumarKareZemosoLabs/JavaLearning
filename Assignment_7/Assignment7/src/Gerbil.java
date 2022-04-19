public class Gerbil extends Rodent {

    Gerbil(){
        System.out.println("Hi,I'm Gerbil!");
    }

    @Override
    public void bodyCharacteristics() {
        System.out.println("I have long tail and small ears, I can stand on my legs and I live in burrows");
    }

    @Override
    public void teeth() {
        //super.teeth();
        System.out.println("Gerbil also don't have Canine teeth!");
    }
}
