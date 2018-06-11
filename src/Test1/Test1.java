package Test1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test1 {

    String line;
    String[] words;
    Set<String> distinctwords;

    public void findWords(FileReader file) {

        try {
            BufferedReader br = new BufferedReader(file);
            while ((line = br.readLine()) != null) {

                distinctwords = new HashSet<String>();
                    String[] words = line.split("[\\p{Punct}\\s]+");
                for (String str : words) {
                    String lowercase=str.toLowerCase();
                    distinctwords.add(lowercase);



                }

                for(String s: distinctwords){
                    System.out.println(s);
                }


            }


        } catch (IOException io) {
            io.printStackTrace(); }



    }


    public static void main(String[] args) throws IOException {
        File file=new File("/Users/yevhensokyrko/IdeaProjects/my-labs/src/goodlinks.txt");
        FileReader fileReader=new FileReader(file);
        Test1 test1=new Test1();
        test1.findWords(fileReader);

    }
}

