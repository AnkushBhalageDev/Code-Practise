package Java_8;

public interface InterfaceB {
    public void m1(String str);
    default void methodM(){
        System.out.println("B Method");
    }
}
