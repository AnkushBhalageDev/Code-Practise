package Dailycode;
import java.util.*;
import java.util.stream.*;
public class Nov6th {
    public static void main(String[] args) {
//        1️⃣ Find the First Non-Repeated Character in a String
//
//        Input:
//
//        "My nam is"
//
//        Output:
//
//        M
        String s1="My name is";
        char c= s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1).findFirst().get().getKey();
System.out.println(c);
        //
//        2️⃣ Find Immediate Lower and Higher Value from List
//
//        Input:
//
//        List = [1,2,3,4,5,6,7,8,9,10] num = 8
//
//        Output:
int[] arr2={1,2,3,4,5,6,7,8,9,10};
Map<Boolean,List<Integer>>map2=Arrays.stream(arr2).boxed().filter(i->i!=8).collect(Collectors.partitioningBy(i->i>8));
        System.out.println(map2.get(false));
int immLow=map2.get(false).get(map2.get(false).size()-1);
int immHigh=map2.get(true).get(0);
System.out.println("Imm Low :"+immLow+" Imm High: "+immHigh);
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
int[]arr3={1,2,3,4,5,6,8,9,98,7,8,0,10,10};
Map<Integer,Long> l3=Arrays.stream(arr3).boxed().collect(Collectors.groupingBy(o->o,Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
System.out.println(l3);
//        4️⃣ Find Strings Containing Character 'K'
//
//        Input:
//
//["Kartik", "Singh", "KarGar"]
//
//        Output:
//
//        Kartik KarGar
String[] arr4={"Kartik", "Singh", "KarGar"};

List<String> ans4=Arrays.stream(arr4).filter(i->i.indexOf("K")==0).toList();
        System.out.println(ans4);
//        5️⃣ Convert List of Strings to Uppercase
//
//        Input:
//"Kartik", "Singh", "KarGar"
//["Kartik", "KarSingh", "Gaurav"]
//
//        Output:
//
//["KARTIK", "KARSINGH", "GAURAV"]
String[] arr5={"Kartik", "Singh", "KarGar"};
List<String> list5=Arrays.stream(arr5).map(String::toUpperCase).toList();
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
int ans6=Arrays.stream(arr6).boxed().collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting())).entrySet().stream()
        .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(ans6);

//        7️⃣ Reverse a String Word by Word
//
//        Input:
//
//        "My name is"
//
//        Output:
//
//        "is name My"
String s7="My name is Ankush";
String [] st7=s7.split(" ");
Collections.reverse(Arrays.asList(st7));
String ans7=Arrays.stream(st7).collect(Collectors.joining(" "));
        System.out.println(ans7);

//        8️⃣ Get First 3 and Last 3 Numbers from List
//
//        Input:
//
//[1,2,3,4,5,6,7,8,9,10]
//
//        Output:
//
//        First 3: [1, 2, 3] Last 3: [8, 9, 10]
int []arr8={1,2,3,4,5,6,7,8,9,10};
List<Integer> first3=Arrays.stream(arr8).limit(3).boxed().toList();
List<Integer> last3=Arrays.stream(arr8).boxed().skip(arr8.length-3).toList();
        System.out.println("First 3 :"+ first3+" Last 3: "+last3);
//        9️⃣ Find Count of Duplicate Characters in String
//
//        Input:
//
//        "kartik"
//
//        Output:
//
//        k -> 2
String s9="Ankush Bhalage";
Map<Character,Long>map9=s9.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Character::toLowerCase,Collectors.counting())).entrySet()
        .stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
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
int arr11[]={1,2,3,4,5,6,8,9,10};
Set<Integer> set11= new LinkedHashSet<>(Arrays.stream(arr11).boxed().collect(Collectors.toSet()));
        System.out.println(set11);
        int a=IntStream.rangeClosed(1, arr11.length).boxed().filter(i->!set11.contains(i)).findFirst().get();
        System.out.println(a);
//        12️⃣ Count Strings Starting with Same Character
//
//        Input:
//
//["Kartik","KarSingh","Gaurav"]
//
//        Output:
String[] atr12={"Kartik","KarSingh","Gaurav"};
Map<Character,List<String>> map12=Arrays.stream(atr12).collect(Collectors.groupingBy(i->i.charAt(0)));
        System.out.println(map12);
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
String [] str13={"level","anksuh","beeb","kartik"};
List<String>list13=Arrays.stream(str13).filter(i->new StringBuilder(i).reverse().toString().equals(i)).toList();
        System.out.println(list13);
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
        List<String> list14=Arrays.stream(str14).sorted(Comparator.comparing(String::length)).toList();
        System.out.println(list14);
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
String[] arr16={"cat","act","tea","eat"};
Map<String,List<String>> map16=Arrays.stream(arr16).collect(Collectors.groupingBy(i->{
    char[] c1= i.toCharArray();
    Arrays.sort(c1);
    return new String(c1);
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
String st17="AnKuSh";
String ans17=st17.chars().mapToObj(i->Character.isUpperCase(i)?Character.toLowerCase((char)i):Character.toUpperCase((char)i))
        .map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(ans17);
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
String s18="My name is is my name ankush";
Map<String,Long> map18=Arrays.stream(s18.split(" ")).collect(Collectors.groupingBy(i->i.toLowerCase(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
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
int[] arr19={2,4,6,8,2,10,4,12,6};
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
        List<Integer> listB=List.of(3,4,5,6,9,1,54,2,25);
        Map<String,List<Integer>> map20=listA.stream().filter(listB::contains).collect(Collectors.groupingBy(i->i%2==0?"EVEN":"ODD"));
        System.out.println(map20);
//
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
String s21a=s21+s21;
        System.out.println(s21a.contains("bcda"));
        System.out.println(s21a.contains("adbc"));
//        22️⃣ Subtract Sum of Divisible-by-6 from Non-Divisible-by-6 Numbers (1 to 30)
//
//        Output:
//
//        Sum of divisible by 6 = 6 + 12 + 18 + 24 + 30 = 90
//        Sum of non-divisible by 6 = 375 - 90 = 285
//        Difference = 285 - 90 = 195
int divby6=IntStream.rangeClosed(1,30).filter(i->i%6==0).sum();
int nonDivBy6=IntStream.rangeClosed(1,30).filter(i->i%6!=0).sum();
        System.out.println(nonDivBy6-divby6);
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
//        24️⃣ Sort List of Strings by Last Character
//
//        Input:
//
//["Ankush","kartik","kunal","banana","apple"]
//
//        Output:
//
//["banana","apple","Ankush","kunal","kartik"]
        List<String> list24=List.of("Ankush","kartik","kunal","banana","apple");
        List<String> list24ans= list24.stream().sorted(Comparator.comparing(i->i.charAt(i.length()-1))).toList();
        System.out.println(list24ans);
//
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
        Set<Character> set= new LinkedHashSet<>();
        StringBuilder s= new StringBuilder();
        for(char d:s25.toCharArray()){
            if(!set.contains(d)){
                set.add(d);
                s.append(d);
            }
        }
        System.out.println(s.toString());
//        26️⃣ Find average salary of each dept
        System.out.println();
//        27️⃣ find out prime numbers from a list
int[]arr26={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
List<Integer> list27=IntStream.rangeClosed(1,arr26.length).boxed().filter(i->isPrime(i)).toList();
        System.out.println(list27);
//        27️⃣ Find total salary of dept
//Map<String,Integer> map27=empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.summingInt(Employee::salary)));
//        28️⃣ count list of vowels in each string from list
        String[] str28={"Ankush","Bhalage","Kartik","Singh"};
        Map<String,Long>map28=Arrays.stream(str28).collect(Collectors.toMap(i->i,
                j->j.chars().mapToObj(k->(char)k).filter(l->"aeiou".indexOf(l)!=-1).count()));
        System.out.println(map28);

        //121 323
        int []arr28={121,234,323};
        List<Integer> lisTostring= Arrays.stream(arr28).boxed().filter(i->i.toString().equals(new StringBuilder(i.toString()).reverse().toString())).toList();
        System.out.println(lisTostring);

        List<Integer> listfun=Arrays.stream(arr28).boxed().filter(Nov6th::isPalindrome).toList();
        System.out.println("Function"+listfun);


    }
    public  static boolean isPrime(int i){
        if(i<=1) return true;
        return IntStream.rangeClosed(2,(int) Math.sqrt(i)).allMatch(a->i%a!=0);
    }
    public static boolean isPalindrome(int i){
        // i=121
        int sum=0;
        int orig=i;
        while(i>0){
            int temp=i%10; // 1 //2 //1
            sum=sum*10+temp;
            //1 //12//121
//            System.out.println(sum);
            i=i/10; //12 //1 //0
        }
        return orig==sum?true:false;
    }
}
