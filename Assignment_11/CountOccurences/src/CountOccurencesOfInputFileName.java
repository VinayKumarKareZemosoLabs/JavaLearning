import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurencesOfInputFileName {
    public static void main(String[] args) throws IOException {
        //Scanner inputFileName = new Scanner (new File(args[0]));

        //Storing command line argument in a string
        String inputFileName = args[0];

        //System.out.println(inputFileName);

        //Counting occurrence of each character

        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        char[] charArray = inputFileName.toCharArray();

        for(char c: charArray){
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }
            else {
                countMap.put(c,1);
            }
        }

        //Printing
        for(Map.Entry entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Writing into file
        FileWriter myWriter = new FileWriter("output.txt");
        myWriter.write(String.valueOf(countMap));
        myWriter.close();



    }
}

/*
        Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument
        and counts the occurrence of all the different characters.
        Save the results in a text file.

*/
