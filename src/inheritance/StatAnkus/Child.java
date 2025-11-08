package inheritance.StatAnkus;

public class Child extends Parent{
    public int a;
    static {
        System.out.println("child static");
    }
    {
        System.out.println("child block");
        a=12;
    }
    @Override
    public int add(int a,int b){
        System.out.println("child add");
        return a+b;
    }
    public static void main(String[] args) {
        Child c= new Child();
        Parent p= new Parent();
        Parent p1= new Child();
        System.out.println(p.add(12,3));
        System.out.println(c.add(32,12));
        System.out.println(p1.add(3,12));//child
        System.out.println(p1.a);//p
        System.out.println(c.a);//c
    }
}
