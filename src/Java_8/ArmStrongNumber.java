package Java_8;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num=153;
        int remender;
        int temp=num;
        int sum=0;
        while (temp!=0)
        {
            remender=temp%10;
            sum=(remender*remender*remender)+sum;
            temp=temp/10;

        }
        if(sum==num)
        {
            System.out.println("Given Number is ArmStrong");
        }
        else {
            System.out.println("Given Number is not a Armstrong");
        }
    }
}
