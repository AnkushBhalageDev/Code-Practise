package Basic;

import java.util.*;
import java.util.stream.*;

public class Palindrome {
    public static void main(String[] args) {
        // palindrome => given string and revserse of it should be same
        String str="beeb";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list2=Arrays.asList(6,7,8,9,10,11,12,13);

        List<Integer>common=list1.stream().filter(list2::contains).filter(i->i%2==0).toList();
        System.out.println(common);
    }
}
