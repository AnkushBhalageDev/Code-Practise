package inheritance.StatAnkus;

public class Parent {
    public int a;
    static {
        System.out.println("Parent Static");
    }
    {
        System.out.println("parent block");
        a=10;
    }
    public int add(int a,int b){
        System.out.println("parent add");
        return a+b;
    }
}
