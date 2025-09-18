package FunctionalInterface;

public class FunInterfaceImpl {
    public static void main(String[] args) {
        FunIterface obj=(a,b)->a+b;
        System.out.println(obj.operation(31,5));

    }
}
