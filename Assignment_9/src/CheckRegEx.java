
import java.util.*;
import java.util.regex.*;

public class CheckRegEx {
    private List<String> list=new ArrayList<String>();

    public CheckRegEx(List<String> l){list=l;}

    public void parse(String regex){
        Pattern p=Pattern.compile(regex);
        Matcher m;
        Formatter f=new Formatter(System.out);
        for(String str:list){
            m=p.matcher(str);
            f.format("%1$-15.15s %2$-8.8s\n", str, m.find());
        }
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any 3 sentences:");
        String input[] = new String[3];

        for(int i=0; i<3; i++){
            input[i]=scan.nextLine();
        }

        CheckRegEx test=new CheckRegEx( Arrays.asList(input) );

        String regex="^[A-Z].*\\.";
        
        test.parse(regex);
    }
}