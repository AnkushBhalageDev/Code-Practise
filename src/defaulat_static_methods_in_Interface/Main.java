package defaulat_static_methods_in_Interface;
/*
* Static method
* 1.static method in interface used to provide more information about that interface
* 2.Implementation class cant access the static method defined in interface
* 3.Method can be access with the help name of interface only [No need to create object]
* */

/*
* Default method
* 1.Implementation class can access the default method defined inside the interface
* 2.If we have to add something that is common for all the implementation classes that implementing same interface we use default method
* 3.No need to define method in implementation class
* 4.Method can be accessed with obj of implementation class
* */

/*Below was the issue solved in java-8 by introducing default and static method
* Problem (Pre-Java 8)	                                            Feature Introduced	            Benefit
Adding new methods to interfaces breaks existing code	            Default methods	                Backward compatibility
Interface-related utility methods had to be in separate classes	    Static methods	                Keep related code inside interface itself
Functional programming support was hard	                            Default methods	                 Enabled richer functional interfaces for lambdas
* */
public class Main {
    public static void main(String[] args) {
        Animal.animalInfo(); // calling static method of animal interface
        Dog d= new Dog();
        d.eat();
        d.animalName("DOG"); // calling default method without overriding it in dog class

        Cat c=new Cat();
        c.eat();
        c.animalName("CAT"); // calling default method without overriding it in cat class
    }
}
