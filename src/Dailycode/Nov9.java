package Dailycode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nov9 {
    record Employee(int id,String name,String dept,int salary){};
    public static void main(String[] args) {
//        1️⃣ Find the First Non-Repeated Character in a String
//
//        Input:
//
//        "My nam is"
//
//        Output:M
//
String s1="My name is";
char c1=s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i, LinkedHashMap::new,Collectors.counting())).entrySet()
        .stream().filter(i->i.getValue()==1).findFirst().get().getKey();
System.out.println(c1);
//        2️⃣ Find Immediate Lower and Higher Value from List
//
//        Input:
//
//        List = [1,2,3,4,5,6,7,8,9,10] num = 8
//
//        Output:
//
//        Immediate High: 9 Immediate Low: 7
int [] arr={1,2,3,4,5,6,7,8,9,10};
Map<Boolean, List<Integer>> map2= Arrays.stream(arr).boxed().filter(i->i!=8).collect(Collectors.partitioningBy(i->i>8));
        System.out.println("Imm Low"+ map2.get(false).get(map2.get(false).size()-1));
        System.out.println("Imm High"+ map2.get(true).get(0));
//        3️⃣ Find Frequency of Repeated Numbers in a List
//
//        Input:
//
//[1,2,3,4,5,6,8,9,98,7,8,0,10,10]
//
//        Output:
//
//        8 -> 2 10 -> 2
        int arr3[]={1,2,3,4,5,6,8,9,98,7,8,0,10,10};
        Map<Integer,Long> map3=Arrays.stream(arr3).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map3);
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
String str4[]={"Kartik", "Singh", "KarGar"};
List<String> list4=Arrays.stream(str4).filter(i->i.contains("K")).toList();
        System.out.println(list4);
//        5️⃣ Convert List of Strings to Uppercase
//
//        Input:
//
//["Kartik", "KarSingh", "Gaurav"]
//
//        Output:
//
//["KARTIK", "KARSINGH", "GAURAV"]
List<String> list5=Arrays.stream(str4).map(String::toUpperCase).toList();
        System.out.println(list5);
//        6️⃣ Find Maximum Repeated Number
//
//        Input:
//
//[1,2,3,5,6,98,6,7,9,9,98,98]
//
//        Output:
//
//        98
int [] arr6={1,2,3,5,6,98,6,7,9,9,98,98};
int a6=Arrays.stream(arr6).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()))
        .entrySet().stream().max(Comparator.comparing(i->i.getValue())).get().getKey();
        System.out.println(a6);
//        7️⃣ Reverse a String Word by Word
//
//        Input:
//
//        "My name is"
//
//        Output:
//
//        "is name My"
String str7="My name is";
List<String> strarr7=Arrays.asList(str7.split(" "));
Collections.reverse(strarr7);
        System.out.println(strarr7);
        String s7=strarr7.stream().collect(Collectors.joining(" "));
        System.out.println(s7);
//        8️⃣ Get First 3 and Last 3 Numbers from List
//
//        Input:
//
//[1,2,3,4,5,6,7,8,9,10]
//
//        Output:
//
//        First 3: [1, 2, 3] Last 3: [8, 9, 10]
int [] arr8={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(arr8).boxed().limit(3).toList());
        System.out.println(Arrays.stream(arr8).boxed().skip(arr8.length-3).toList());
//        9️⃣ Find Count of Duplicate Characters in String
//
//        Input:
//
//        "kartik"
//
//        Output:
//
//        k -> 2
String s9="kartik";
Map<Character,Long> map9=s9.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()))
        .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map9);
//🔟 Find Numbers Starting with 2
//
//        Input:
//
//[1,22,20,25,30,35]
//
//        Output:
//
//[22, 20, 25]
int [] arr10={1,22,20,25,30,35};
List<Integer> list10=Arrays.stream(arr10).boxed().filter(i->i.toString().startsWith("2")).toList();
        System.out.println(list10);
//        11️⃣ Find Missing Element from Sequence
//
//        Input:
//
//[1,2,3,4,5,6,8,9,10]
//
//        Output:
//
//        7
int [] arr11={1,2,3,4,5,6,8,9,10};
Set<Integer> set11= Arrays.stream(arr11).boxed().collect(Collectors.toSet());
int a11= IntStream.rangeClosed(1,arr11.length).boxed().filter(i->!set11.contains(i)).findFirst().get();
        System.out.println(a11);

//        12️⃣ Count Strings Starting with Same Character
//
//        Input:
//
//["Kartik","KarSingh","Gaurav"]
//
//        Output:
//
//        K -> [Kartik, KarSingh] G -> [Gaurav]
String str12[]={"Kartik","KarSingh","Gaurav"};
Map<Character,List<String>> map12=Arrays.stream(str12).collect(Collectors.groupingBy(i->i.charAt(0)));
        System.out.println(map12);
//        13️⃣ Find Palindrome Strings from List
//
//        Input:
//
//["level","beeb","kartik"]
//
//        Output:
//
//["level", "beeb"]
String[]str13={"level","beeb","kartik"};
List<String>palindrome=Arrays.stream(str13).filter(i->i.contentEquals(new StringBuilder(i).reverse())).toList();
        System.out.println(palindrome);

//        14️⃣ Sort Strings by Their Length
//
//        Input:
//
//["Kartik","Gaurav","Ram","KarSingh"]
//
//        Output:
//
//["Ram","Kartik","Gaurav","KarSingh"]
String[]str14={"Kartik","Gaurav","Ram","KarSingh"};
List<String> sortedStrings=Arrays.stream(str14).sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedStrings);
//        15️⃣ Find Second Highest Number
//
//        Input:
//
//[5,9,11,2,8]
//
//        Output:
//
//        9
int [] arr15={5,9,11,2,8};
int secHigh=Arrays.stream(arr15).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println(secHigh);
//        16️⃣ Group Anagrams
//
//        Input:
//
//["cat","act","tea","eat"]
//
//        Output:
//
//        { act=[cat, act], aet=[tea, eat] }
String [] str16={"cat","act","tea","eat"};
Map<String,List<String>> map16=Arrays.stream(str16).collect(Collectors.groupingBy(i->{
    char[]c=i.toCharArray();
    Arrays.sort(c);
    return new String(c);

}));
        System.out.println(map16);
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
String ans18="AnKusH".chars().mapToObj(i->Character.isUpperCase(i)?Character.toLowerCase((char)i):Character.toUpperCase((char)i)).map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(ans18);
//        Input:
//
//        "My name is is"
//
//        Output:
//
//        My -> 1
//        name -> 1
//        is -> 2
        String s18="My name is is";
Map<String,Long> map18=Arrays.stream(s18.split(" ")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map18);
//        19️⃣ If Number Divisible by 3 Then Square It
//
//        Input:
//
//[2,4,6,8,2,10,4,12,6]
//
//        Output:
//
//[2,4,36,8,2,10,4,144,36]
int [] arr19={2,4,6,8,2,10,4,12,6};
List<Integer> list19=Arrays.stream(arr19).boxed().map(i->i%3==0?i*i:i).toList();
        System.out.println(list19);
//        20️⃣ Find Common Even Elements Between Two Lists
//
//        Input:
//
//        ListA = [1,2,11,3,25,54,5,6,7,8] ListB = [3,4,5,6,9,1,54,2,25]
//
//        Output:
//
//        EVEN : [2, 54, 6] ODD : [1, 5, 25]
List<Integer> listA=List.of(1,2,11,3,25,54,5,6,7,8);
List<Integer>listB=List.of(3,4,5,6,9,1,54,2,25);

Map<String,List<Integer>> map20=listA.stream().filter(listB::contains).collect(Collectors.groupingBy(i->i%2==0?"EVEN":"ODD"));
        System.out.println(map20);
//        21️⃣ Check if String is Valid Rotation
//
//        Input:
//
//        "abcd" and "bcda"
//
//        Output:
//
//        true
String s21="abcd";
String temp=s21+s21;
        System.out.println(s21.contains("bcda"));
        System.out.println(s21.contains("bdca"));
//        22️⃣ Subtract Sum of Divisible-by-6 from Non-Divisible-by-6 Numbers (1 to 30)
//
//        Output:
//
//        Sum of divisible by 6 = 6 + 12 + 18 + 24 + 30 = 90
//        Sum of non-divisible by 6 = 375 - 90 = 285
//        Difference = 285 - 90 = 195
int divBy6=IntStream.rangeClosed(1,30).filter(i->i%6==0).sum();
int nonDiv6=IntStream.rangeClosed(1,30).filter(i->i%6!=0).sum();
        System.out.println(nonDiv6-divBy6);
//        23️⃣ Check if Two Strings are Anagrams
//
//        Input:
//
//        "Listen" and "siLent"
//
//        Output:
//        System.out.println(Arrays.sort("Listen".toCharArray()).e);
//        true
//
//        24️⃣ Sort List of Strings by Last Character
//
//        Input:
//
//["Ankush","kartik","kunal","banana","apple"]
//
//        Output:
//
//["banana","apple","Ankush","kunal","kartik"]
String [] s24={"Ankush","kartik","kunal","banana","apple"};
List<String> list24=Arrays.stream(s24).sorted(Comparator.comparing(i->i.charAt(i.length()-1))).toList();
        System.out.println(list24);
//        25️⃣ Remove Duplicate Characters and Keep Order
//
//        Input:
//
//        "Ankush Bhalage"
//
//        Output:
//
//        Ankush Blge
String s25= "Ankush Rajendra Bhalage";
Set<Character> set25= new LinkedHashSet<>();
StringBuilder sb25= new StringBuilder();
for(char c:s25.toCharArray()){
    if(!set25.contains(c)&&c!=' '){
        sb25.append(c);
        set25.add(c);
    }
}
        System.out.println(sb25.toString());
//        26️⃣ Find average salary of each dept
//
//        27️⃣ find out prime numbers from a list
        int[]arr27={1,2,3,4,5,7,8,9,10,11,12,13};
        List<Integer> list27=Arrays.stream(arr27).boxed().filter(i->{
            if(i<=1) return true;
            return IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(j->i%j!=0);
        }).toList();
        System.out.println(list27);
//
//        27️⃣ Find total salary of dept
//
//        28️⃣ count list of vowels in each string from list
        Map<String,Long> map28=Arrays.stream(s24).collect(Collectors.toMap(i->i,j->j.chars().mapToObj(k->(char)k)
                .filter(l-> "aeiou".indexOf(l)!=-1).count()));
        System.out.println(map28);

        List<Employee> employeeList=List.of(
                new Employee(2,"asdad","IT",25),
                new Employee(1,"Ankush","IT",26),
                new Employee(3,"Pakaj","Non-IT",35),
                new Employee(6,"kartik","Non-IT",37),
                new Employee(4,"pratham","IT",30)
        );

        // second high sal
        Employee secHighSa=employeeList.stream().sorted(Comparator.comparing(Employee::salary).reversed()).skip(1).findFirst().get();
        System.out.println(secHighSa);
        // max from each dept
        Map<String,Employee> mapmax=employeeList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),list->list.stream().max(Comparator.comparing(Employee::salary)).get())));
        System.out.println(mapmax);

        // salary > 28

        Map<String,String> salg28=employeeList.stream().filter(i->i.salary>28).collect(Collectors.toMap(Employee::name,Employee::dept));
        System.out.println(salg28);
        // dept sorted salary
        Map<String,List<Employee>> sortEmpDept= employeeList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),list->list.stream().sorted(Comparator.comparing(Employee::salary).reversed()).toList())));
        System.out.println(sortEmpDept);
        // emp 20-30,30,40
        Map<String,List<Employee>> rangesal=employeeList.stream().collect(Collectors.groupingBy(i->{
            if(i.salary>20&&i.salary<30)return "20-30";
            else return "30-40";
        }));
        System.out.println(rangesal);


        int []arr123={0,1,1,0,1,0,0,1};
        List<Integer> list123=Arrays.stream(arr123).boxed().map(i->zeroOne(i)).toList();
        System.out.println(list123
        );

    }
    public static int zeroOne(int a){
        return a==1?0:1;
    }
}
