package Dailycode;

import java.util.Arrays;
import java.util.*;
import  java.util.stream.*;

public class Oct29 {
    record Employee(int id,String name,int salary,String dept){    }
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
//        empList.add(new Employee(1,"Ankush",20000,"IT"));
//        empList.add(new Employee(3,"Shrikanta",15000,"HR"));
//        empList.add(new Employee(4,"Shyam",25500,"IT"));
//        empList.add(new Employee(2,"Ram",21000,"HR"));
        // HR Department
//        empList.add(new EmployeeImpl.Employee(1,"Amit",25000,"HR"));
//        empList.add(new EmployeeImpl.Employee(2,"Ram",21000,"HR"));
        empList.add(new Employee(3,"Neha",23000,"HR"));
        empList.add(new Employee(4,"Vikas",24000,"HR"));
        empList.add(new Employee(5,"Priya",22000,"HR"));

// IT Department
        empList.add(new Employee(6,"Rohan",35000,"IT"));
        empList.add(new Employee(7,"Sita",36000,"IT"));
        empList.add(new Employee(8,"Arjun",34000,"IT"));
//        empList.add(new EmployeeImpl.Employee(9,"Meena",37000,"IT"));
//        empList.add(new EmployeeImpl.Employee(10,"Karan",33000,"IT"));

// Finance Department
//        empList.add(new EmployeeImpl.Employee(11,"Anil",28000,"Finance"));
//        empList.add(new EmployeeImpl.Employee(12,"Sunita",29000,"Finance"));
//        empList.add(new EmployeeImpl.Employee(13,"Rajesh",30000,"Finance"));
        empList.add(new Employee(14,"Kavita",31000,"Finance"));
        empList.add(new Employee(15,"Deepak",29500,"Finance"));

// Sales Department
        empList.add(new Employee(16,"Mohit",27000,"Sales"));
        empList.add(new Employee(17,"Komal",26000,"Sales"));
//        empList.add(new Employee(18,"Ravi",28000,"Sales"));
//        empList.add(new Employee(19,"Pooja",27500,"Sales"));
//        empList.add(new Employee(20,"Alok",26500,"Sales"));

// Marketing Department
        empList.add(new Employee(21,"Nikhil",32000,"Marketing"));
        empList.add(new Employee(22,"Shreya",33000,"Marketing"));
        empList.add(new Employee(23,"Gaurav",31000,"Marketing"));
        empList.add(new Employee(24,"Divya",32500,"Marketing"));
        empList.add(new Employee(25,"Manish",31500,"Marketing"));


//        1️⃣ Find the First Non-Repeated Character in a String
//
//        Input:
//
//        "My nam is"
//
//        Output:
//
//        M
//
//        2️⃣ Find Immediate Lower and Higher Value from List
//
//        Input:
//
//        List = [1,2,3,4,5,6,7,8,9,10] num = 8
//
//        Output:
//
//        Immediate High: 9 Immediate Low: 7
//
//        3️⃣ Find Frequency of Repeated Numbers in a List
//
//        Input:
//
//[1,2,3,4,5,6,8,9,98,7,8,0,10,10]
//
//        Output:
//
//        8 -> 2 10 -> 2
//
//        4️⃣ Find Strings Containing Character 'K'
//
//        Input:
//
//["Kartik", "Singh", "KarGar"]
//
//        Output:
//
//        Kartik KarGar
//
//        5️⃣ Convert List of Strings to Uppercase
//
//        Input:
//
//["Kartik", "KarSingh", "Gaurav"]
//
//        Output:
//
//["KARTIK", "KARSINGH", "GAURAV"]
//
//        6️⃣ Find Maximum Repeated Number
//
//        Input:
//
//[1,2,3,5,6,98,6,7,9,9,98,98]
//
//        Output:
//
//        98
//
//        7️⃣ Reverse a String Word by Word
//
//        Input:
//
//        "My name is"
//
//        Output:
//
//        "is name My"
//
//        8️⃣ Get First 3 and Last 3 Numbers from List
//
//        Input:
//
//[1,2,3,4,5,6,7,8,9,10]
//
//        Output:
//
//        First 3: [1, 2, 3] Last 3: [8, 9, 10]
//
//        9️⃣ Find Count of Duplicate Characters in String
//
//        Input:
//
//        "kartik"
//
//        Output:
//
//        k -> 2
//
//🔟 Find Numbers Starting with 2
//
//        Input:
//
//[1,22,20,25,30,35]
//
//        Output:
//
//[22, 20, 25]
//
//        11️⃣ Find Missing Element from Sequence
//
//        Input:
//
//[1,2,3,4,5,6,8,9,10]
//
//        Output:
//
//        7
//
//        12️⃣ Count Strings Starting with Same Character
//
//        Input:
//
//["Kartik","KarSingh","Gaurav"]
//
//        Output:
//
//        K -> [Kartik, KarSingh] G -> [Gaurav]
//
//        13️⃣ Find Palindrome Strings from List
//
//        Input:
//
//["level","beeb","kartik"]
//
//        Output:
//
//["level", "beeb"]
//
//        14️⃣ Sort Strings by Their Length
//
//        Input:
//
//["Kartik","Gaurav","Ram","KarSingh"]
//
//        Output:
//
//["Ram","Kartik","Gaurav","KarSingh"]
//
//        15️⃣ Find Second Highest Number
//
//        Input:
//
//[5,9,11,2,8]
//
//        Output:
//
//        9
//
//        16️⃣ Group Anagrams
//
//        Input:
//
//["cat","act","tea","eat"]
//
//        Output:
//
//        { act=[cat, act], aet=[tea, eat] }
//
//        17️⃣ Convert String to Toggle Case
//
//        Input:
//
//        "AnKusH"
//
//        Output:
//
//        aNkUSh
//
//        18️⃣ Count Repeated Words in String
//
//        Input:
//
//        "My name is is"
//
//        Output:
//
//        My -> 1
//        name -> 1
//        is -> 2
//
//        19️⃣ If Number Divisible by 3 Then Square It
//
//        Input:
//
//[2,4,6,8,2,10,4,12,6]
//
//        Output:
//
//[2,4,36,8,2,10,4,144,36]
//
//        20️⃣ Find Common Even Elements Between Two Lists
//
//        Input:
//
//        ListA = [1,2,11,3,25,54,5,6,7,8] ListB = [3,4,5,6,9,1,54,2,25]
//
//        Output:
//
//        EVEN : [2, 54, 6] ODD : [1, 5, 25]
List<Integer> list201=Arrays.asList(1,2,11,3,25,54,5,6,7,8);
List<Integer> list202=Arrays.asList(3,4,5,6,9,1,54,2,25);
Map<String,List<Integer>> map201=list201.stream().filter(list202::contains).collect(Collectors.groupingBy(i->i%2==0?"EVEN":"ODD"));
        System.out.println(map201);







//        21️⃣ Check if String is Valid Rotation
//
//        Input:
//
//        "abcd" and "bcda"
//
//        Output:
//
//        true

        String s211="abcd";
        if((s211+s211).contains("bcad")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




//        22️⃣ Subtract Sum of Divisible-by-6 from Non-Divisible-by-6 Numbers (1 to 30)
//
//        Output:
//
//        Sum of divisible by 6 = 6 + 12 + 18 + 24 + 30 = 90
//        Sum of non-divisible by 6 = 375 - 90 = 285
//        Difference = 285 - 90 = 195

      int div6=  IntStream.rangeClosed(1,30).filter(i->i%6==0).sum();
        int nondiv6=IntStream.rangeClosed(1,30).filter(i->i%6!=0).sum();
        int out22=nondiv6-div6;
        System.out.println(div6);
//        23️⃣ Check if Two Strings are Anagrams
//
//        Input:
//
//        "Listen" and "siLent"
//
//        Output:
//
//        true
//
        String s231="Listen";
        String s232="Silent";

        char[] c231=s231.toLowerCase().toCharArray();
        char[] c232=s232.toLowerCase().toCharArray();
        Arrays.sort(c231);
        Arrays.sort(c232);
        if(Arrays.equals(c231,c232)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

//        24️⃣ Sort List of Strings by Last Character
//
//        Input:
//
//["Ankush","kartik","kunal","banana","apple"]
//
//        Output:
//
//["banana","apple","Ankush","kunal","kartik"]

        List<String> list24=Arrays.asList("Ankush","kartik","kunal","banana","apple");
        List<String> ans24=list24.stream().sorted(Comparator.comparing(i->i.charAt(i.length()-1))).toList();
        System.out.println(ans24);
//        25️⃣ Remove Duplicate Characters and Keep Order
//
//        Input:
//
//        "Ankush Bhalage"
//
//        Output:
//
//        Ankush Blge
        String s25="Ankush Bhalage";
        StringBuilder sb25= new StringBuilder();
        char[] c25=s25.toCharArray();
        Set<Character> set25= new LinkedHashSet<>();
        for(char c:c25){
            if(!set25.contains(c)){
               sb25.append(c);
               set25.add(Character.toLowerCase(c));
            }
        }
        System.out.println(sb25);

//
//        26️⃣ Find average salary of each dept
        Map<String,Double> map26= empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.averagingDouble(Employee::salary)));
        System.out.println(map26);
//
//        27️⃣ find out prime numbers from a list
List<Integer> list27= Arrays.asList(1,2,3,4,5,6,8,7,9,7);
List<Integer> ans27= list27.stream().distinct().filter(i->isPrime(i)).toList();
        System.out.println(ans27);
//        27️⃣ Find total salary of dept
        Map<String,Integer> map28=empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.summingInt(Employee::salary)));
        System.out.println(map28);
//
//        28️⃣ count list of vowels in each string from list
        List<String> list29= Arrays.asList("Ankush","Bhalage","Rajendra");
        Map<String,Long> map29=list29.stream().collect(
                Collectors.toMap(i->i,j->j.chars().mapToObj(k->(char)k)
                        .filter(l->"aeiou".indexOf(l)!=-1).count()));
        System.out.println(map29);
    }
    public static boolean isPrime(int i){
        if(i<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(j->i%j!=0);
    }
}
