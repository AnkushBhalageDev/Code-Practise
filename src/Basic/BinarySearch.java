package Basic;

public class BinarySearch {
    // Array should be sorted



    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int left=0;
        int right=arr.length-1;
        int target=7;
       while(left<right){
            int mid=(left+right)/2;
            System.out.println(mid);
            if(target==arr[mid]){
                System.out.println("Mid : "+mid);
                    break;
            }
            if(target<arr[mid]){
                right=mid;
            }else{
                left=mid;
            }
        }
    }

}
