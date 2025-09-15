package Immutable;

public class Main
{
    public static void main(String[] args) {
        ImmutableExamlple i1=new ImmutableExamlple("Ankush");
        ImmutableExamlple i2= new ImmutableExamlple("Kartik");

        System.out.println(i1.hashCode()+" "+i2.hashCode());
    }
}
