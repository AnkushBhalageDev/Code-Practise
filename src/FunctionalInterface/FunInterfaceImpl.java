package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInterfaceImpl {
    public static void main(String[] args) {
        FunIterface obj=(a,b)->a+b;
        FunIterface obj1=(a,b)->a*b;
        System.out.println(obj.operation(31,5));
        System.out.println(obj1.operation(12,15));

        //consumer interface => used by forEach method
        Consumer<String> c=(inp)-> System.out.println(inp);
        c.accept("ankush");

        //predicate interface
        Predicate<String> p= (j)-> j.equals("ankush");
        System.out.println(p.test("ankush"));
        System.out.println(p.test("ram"));

        Supplier<String> s= ()->  "ankush";
        System.out.println(s.get());

    }
}
