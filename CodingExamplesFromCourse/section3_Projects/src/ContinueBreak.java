public class ContinueBreak {
    public static void main(String[] args) {
        int cnt=0;

        while(cnt<10){
            if(cnt == 5){
                cnt++;
                //continue; //skip
                break; //break loop entirely
            }
            System.out.print(cnt+ "\t");
            cnt++;
        }
    }
}
