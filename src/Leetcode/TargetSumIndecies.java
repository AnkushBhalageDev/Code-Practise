package Leetcode;

import java.util.HashMap;

public class TargetSumIndecies {
    public static void main(String[] args) {
        int num[]={2,3,6,7,9,11};
        int targetSum=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length-1;i++)
        {
            map.put(num[i],i);
        }
        for(int i=0;i<num.length;i++)
        {
            int nums=num[i];
            int remains=targetSum-nums;
            if(map.containsKey(remains)&&map.get(remains)!=i)
            {
                System.out.println("indecies  "+i+"   "+ map.get(remains));
                return;
            }
        }
    }
}
