package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionExample {
    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
       try {
//           ExceptionExample.readFile(12);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       String s="I Love java";
       String s1= Arrays.asList(s.split(" ")).stream().map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(s1);

    }
}
