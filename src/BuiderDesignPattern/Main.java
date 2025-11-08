package BuiderDesignPattern;

public class Main {


    public static void main(String[] args) {
        User user= new User.Builder("Ankush","bhalage@fev.com")
                .age(25)
                .address("Yavatmal")
                .number(845949094)
                .build();
        System.out.println(user);

        User user1= new User.Builder("Ram","Ram@fev.com").build();
        System.out.println(user1);
    }
}
