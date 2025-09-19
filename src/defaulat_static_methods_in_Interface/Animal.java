package defaulat_static_methods_in_Interface;

public interface Animal {
    void eat();
    default void animalName(String name){
        System.out.println("The extended animal is : "+ name);
    }
    static void animalInfo(){
        System.out.println("This is Animal information");
    }
}
