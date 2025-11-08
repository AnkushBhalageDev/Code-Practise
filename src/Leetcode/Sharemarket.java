package Leetcode;

public class Sharemarket {
    // find out max profit from given data by selling and buying once only [6,2,5,1,7]
    public static int buyOnceSellOnce(int [] arr){
       int minPrice=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int price:arr){
           if(price<minPrice){
               minPrice=price; // 6 2 2 1
           }
           int profit= price-minPrice; //0 0 3 0 6
           if(profit > maxProfit){
               maxProfit=profit; //0 0 3 3 6
           }
       }
       return maxProfit;
    }
    public static int buyMulSellMul(int [] arr){
        int totalprofit=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                totalprofit=arr[i+1] + arr[i];
            }
        }
                 return totalprofit;
    }
    public static void main(String[] args) {
        int [] arr={6,2,5,1,7};
        System.out.println(buyOnceSellOnce(arr));
        System.out.println(buyMulSellMul(arr));
    }
}
