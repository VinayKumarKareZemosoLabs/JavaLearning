import org.omg.CORBA.WStringSeqHelper;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        //ArrayList<int> myNumList //only works with reference times data not primitive typr


        nameList.add("Vinay");
        nameList.add("Srinivas");
        nameList.add("vishnu");
        nameList.add("Neeraj");
        nameList.add("Sapneel");

//        for(int i=0; i<nameList.size(); i++){
//            System.out.println(nameList.get(i));
//        }
        for(String i : nameList){
            System.out.println(i);
        }
    }
}
