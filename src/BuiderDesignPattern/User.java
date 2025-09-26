package  BuiderDesignPattern;
public class User{
    //required parameters
   private String name;
   private String email;

   //optional parameters
   private int age;
   private String address;
   private int number;

   // private constructor
    private User(Builder builder){
        this.name=builder.name;
        this.email=builder.email;
        this.age=builder.age;
        this.address=builder.address;
        this.number=builder.number;
    }

   //static inner builder class
   public static class Builder {
       private String name;
       private String email;
       private int age;
       private String address;
       private int number;

       public Builder(String name, String email) {
           this.name = name;
           this.email = email;
       }

       public Builder age(int age) {
           this.age = age;
           return this;
       }

       public Builder address(String address) {
           this.address = address;
           return this;
       }

       public Builder number(int number) {
           this.number = number;
           return this;
       }

       public User build() {
           return new User(this);
       }
   }
   @Override
   public String toString(){
   return "User{name='" + name + "', email='" + email + "', age=" + age +", address="+address+", number="+number+" }";
        }



}
