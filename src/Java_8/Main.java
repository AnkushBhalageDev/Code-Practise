package Java_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.*;
public class Main implements InterfaceA,InterfaceB{


    @Override
    public void m1(String str) {
        System.out.println("Calling interface "+str);
    }

    @Override
    public void methodM() {
        InterfaceB.super.methodM();
    }

    public static <T> Set<T> getDuplicates(T[] t){
        Set<T> set= new HashSet<>();
        return Arrays.stream(t).filter(i->!set.add(i)).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Main mainme= new Main();
        mainme.m1("A");
        mainme.m1("B");
        mainme.methodM();
        String str1=null;
//       String str3= Optional.ofNullable(str1).orElseThrow(()-> new RuntimeException("Value is null"));
//
//        System.out.println(str3);

        Integer [] arr={1,2,3,4,5,1,2,5,6};
        Character[] carr={'a','B','a','c','d','B'};
        System.out.println(getDuplicates(arr));
        System.out.println(getDuplicates(carr));

        int []arr2={1,2,3,4,5,6,7,8,9,10};
        int left=0;
        int right=arr2.length-1;
        int target=7;
        while(left<right){
            int mid=(left+right)/2;
            if(target==arr2[mid]){
                System.out.println(mid);
                break;
            } else if (target<arr2[mid]) {
                right=mid;
            }else left=mid;
        }
    }



}
