package week_12.assigments;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/The_Cranberries");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                 input.next();
                 count++;
            }
            input.close();
            System.out.println("The file have " + count + " words in \n" + url);
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        }catch (IOException ex){
            System.out.println("I/O Errors: no such file");
        }
    }
}
