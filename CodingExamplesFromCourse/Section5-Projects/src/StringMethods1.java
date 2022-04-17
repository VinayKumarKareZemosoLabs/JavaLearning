public class StringMethods1 {

    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }


        System.out.println();

        if(name.equals(name2)){
            System.out.println("Names are equal");

        }
        else System.out.println("Names aren't equal");

        String myName="vinay";

        if(myName.compareTo(name)>0){
            System.out.println(myName +" greater than "+ name);
        }
        else System.out.println(myName + " is less than or equals to  "+name);




    }
}
