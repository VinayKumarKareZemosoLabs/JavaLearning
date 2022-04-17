import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingHost {
    private static void checkPing(String hostName) {

        String[] command = { "cmd.exe", "/C", "ping " + hostName };
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader buff = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String headline;
            while ((headline = buff.readLine()) != null) {
                if (headline.contains("Reply")) {
                    System.out.println("Pinged " + hostName + " in : "
                            + headline.substring(headline.indexOf("time=") + 5, headline.indexOf("ms")) + " ms");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        PingHost ref = new PingHost();
        checkPing("192.0.0.1");
    }
}
