package Dailycode;

import java.util.*;

import java.util.stream.*;

public class Nov15 {
    public static void main(String[] args) {


        //Find the first Non-Repeated Character in given String
        String str="ankush bhalage";
        char c=str.replaceAll(" ","").chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(c);



        //Find the Immediate lowest and highest value of 7
        List<Integer> lst1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
Map<Boolean,List<Integer>> map1=lst1.stream().filter(i->i!=8).collect(Collectors.partitioningBy(i->i>8));
int immLow=map1.get(false).get(map1.get(false).size()-1);
int immHigh=map1.get(true).get(0);
        System.out.println(immLow +" "+ immHigh);

        //Find the frequency/or count how many Number are repeated
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,8,9,98,7,8,0,10,10);
Map<Integer,Long> ans2=list2.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream()
        .filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(ans2);
        //Find the String which contains 'k'
        List<String> list3=Arrays.asList("Kartik","Singh","KarGar");
List<String> ans3=list3.stream().filter(i->i.indexOf("K")!=-1).toList();
        System.out.println(ans3);

        //Convert each character in UpperCase
        List<String> list4= Arrays.asList("Kartik","KarSingh","Gaurav");
List<String> ans4=list4.stream().map(String::toUpperCase).toList();
        System.out.println(ans4);

        //Find the maximum repeated value
        List<Integer> list5=Arrays.asList(1,2,3,5,6,98,6,7,9,9,98,98);
int ans5=list5.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(ans5);
        //Reverse the String
        String string2="My name is";
        String[] str6=string2.split(" ");
        Collections.reverse(Arrays.asList(str6));
String ans6=Arrays.stream(str6).collect(Collectors.joining(" "));
            System.out.println(ans6);
        //Find the last three Number and Start Three Number
        List<Integer> list6=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            System.out.println("First 3 Num :"+list6.stream().limit(3).toList());
            System.out.println("Last 3 Num :"+ list6.stream().skip(list6.size()-3).toList());
        //Find the count of Duplicate words in given String
        String string5="kartik";
Map<Character,Long> map5=string5.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
        .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map5);


        //Find the Number starts with '2'
        List<Integer> list8=Arrays.asList(1,22,20,25,30,35);
List<Integer> ans8=list8.stream().filter(i->i.toString().startsWith("2")).toList();
        System.out.println(ans8);

        //Find the missing Element
        int [] arr={1,2,3,4,5,6,8,9,10};
        Set<Integer>set9=Arrays.stream(arr).boxed().collect(Collectors.toSet());
int ans9=IntStream.rangeClosed(1,arr.length).boxed().filter(i->!set9.contains(i)).findFirst().get().intValue();
        System.out.println(ans9);
        //Count the number of string which is stared by same character
        List<String> list9=Arrays.asList("Kartik","KarSingh","Gaurav");
Map<Character,List<String>> map9=list9.stream().collect(Collectors.groupingBy(i->i.charAt(0)));
        System.out.println(map9);
        //Find the Palindrome string in given List
        List<String> list10=Arrays.asList("level","beeb","kartik");
List<String> ans10=list10.stream().filter(i->i.equals(new StringBuilder(i).reverse().toString())).toList();
        System.out.println(ans10);
        //Sort the String according to their length
        List<String> list11=Arrays.asList("Kartik","Gaurv","Ram","KarSingh");
List<String> ans11=list11.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(ans11);
        //Find the second highest Number in Given list
        int [] arst={5,9,11,2,8};
        int secHigh=Arrays.stream(arst).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println(secHigh);

        //Find the Anagram and group them
        List<String> list12=Arrays.asList("cat","act","tea","eat");
Map<String,List<String>> map12=list12.stream().collect(Collectors.groupingBy(i->{
    char[] f=i.toCharArray();
    Arrays.sort(f);
    return new String(f);
}));
        System.out.println(map12);
        //Convert string into Toggle String
        String string10="AnKusH";
String ans133=string10.chars().mapToObj(i->Character.isUpperCase(i)?Character.toLowerCase((char)i):Character.toUpperCase((char)i)).map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(ans133);
        //Find the Number of Repeated words in given String
        String strLista="My name is is";
Map<String,Long> map14=Arrays.stream(strLista.split(" ")).collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
        .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map14);
        //In given List if we found number with is divisible by 3 the sqaure that number and other number print as it is
        int [] arrs={2,4,6,8,2,10,4,12,6};            // out put 2,4,36,8,2,10,4,144,36
int [] ar13=Arrays.stream(arrs).map(i->i%3==0?i*i:i).toArray();
       for(int a:ar13){
           System.out.println(a);
       }
        // in the given 2 listA and listB , findout common elements which are even
        List<Integer> listA= Arrays.asList(1,2,11,3,25,54,5,6,7,8);
        List<Integer> listB= Arrays.asList(3,4,5,6,9,1,54,2,25);
List<Integer> commonEven= listA.stream().filter(listB::contains).filter(i->i%2==0).toList();
        System.out.println(commonEven);
        // find out valid rotation on string
        // eg: valid rotate string of string "abcd" are "bcda","cdba","dabc"
        // eg: invalid rotate string of string "abcd" are "adbc","dacb","cabd",etc
        String a="abcd";

//div by 6 and non div by 6 substraction
        List<Integer> listInt= Arrays.asList(1,2,3,5,6,98,6,7,9,9,98,98);


        // 2 string anagram or not
        String listen="Listen";
        String silent="siLent";

        // sort list by last character
        List<String> strArr= Arrays.asList("Ankush","kartik","kunal","banana","apple");

        // print each characters once only
        String name="Ankush Bhalage";

        // count vowels from each string
            String [] str23={"Ankush","Bhalage","kartik","prathamesh"};
            Map<String,Long> ans123 =Arrays.stream(str23).collect(Collectors.toMap(i->i,j->j.chars().mapToObj(i->(char)i).filter(i->"aeiou".indexOf(i)!=-1).count()));
            System.out.println(ans123);

        List<String> list500=Arrays.asList("Kartik",null,"","Singh","  ");
        Map<Integer,List<String>> sol=list500.stream().filter(i->i!=null).filter(i->!i.isBlank()).collect(Collectors.groupingBy(String::length));
        System.out.println(sol);
//        List<String> list500=Arrays.asList("Kartik",null,"","Singh","  ");
        Map<String,Long> map=list500.stream().filter(i->i!=null).filter(i->!i.isBlank()).collect(Collectors.toMap(i->i,j->j.chars().mapToObj(i->(char)i).filter(i->"aeiou".indexOf(i)!=-1).count()));

        System.out.println(map);
    }
}
