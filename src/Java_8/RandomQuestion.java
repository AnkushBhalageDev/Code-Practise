package Java_8;

import java.util.Arrays;

public class RandomQuestion {
    public static void main(String[] args) {
        //Find the sum of Element in given String
        String str="Kartik123Singh";
        Integer sumValue=str.chars().filter(Character::isDigit).map(i->i-'0').sum();
        System.out.println(sumValue);

        //Find the sqaure of Each number
//        List<Integer> list= Arrays.asList(
//
//        )


    }
}
