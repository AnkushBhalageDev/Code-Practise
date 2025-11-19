package Java_8;

public interface InterfaceA {
    public void m1(String str);
    default void methodM(){
        System.out.println("A Method");
    }
}
