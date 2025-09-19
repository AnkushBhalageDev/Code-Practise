package Basic;

public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {  // base case
            return 1;
        } else {
            return n * factorial(n - 1);  // recursive case
        }
    }

    public static void main(String[] args) {
        int num = 5;
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
