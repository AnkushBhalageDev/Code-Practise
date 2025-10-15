package Java_8;

import java.util.*;
import java.util.stream.*;

public class Streaming {
    public static void main(String[] args) {
        //Find the first Non-Repeated Character in given String
        String string1="My nam is";
        Character c= string1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1).findFirst().get().getKey();
        System.out.println(c);

        //Find the Immediate lowest and highest value
        List<Integer> lst1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int num=8;
        Map<Boolean,List<Integer>> lowhigh = lst1.stream().filter(i->i!=num).collect(Collectors.partitioningBy(i->i>num));
        int immHigh=lowhigh.get(true).get(0);
        int imLow=lowhigh.get(false).get(lowhigh.get(false).size()-1);

        System.out.println("Immediate High : "+ immHigh+" Immediate Low :"+imLow);

        //Find the frequency/or count how many Number are repeated
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,8,9,98,7,8,0,10,10);
        list2.stream().collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)).forEach((k,v)->System.out.println(k+" "+v));

        //Find the String which contains 'k'
        List<String> list3=Arrays.asList("Kartik","Singh","KarGar");
        list3.stream().filter(i->i.indexOf('K')!=-1).forEach(System.out::println);

        //Convert each character in UpperCase
        List<String> list4= Arrays.asList("Kartik","KarSingh","Gaurav");
        List<String> upperList=list4.stream().map(String::toUpperCase).toList();
        System.out.println(upperList);

        //Find the maximum repeated value
        List<Integer> list5=Arrays.asList(1,2,3,5,6,98,6,7,9,9,98,98);
       Integer maxRep = list5.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(maxRep);

        //Reverse the String
        String string2="My name is";
        List<String> strList= Arrays.asList(string2.split(" "));
        Collections.reverse(strList);
        String revStr =strList.stream().collect(Collectors.joining(" "));
        System.out.println(revStr);

        //Find the last three Number and Start Three Number
        List<Integer> list6=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> firstThree= list6.stream().limit(3).toList();
        List<Integer> lastThree=list6.stream().skip(list6.size()-3).toList();
        System.out.println("First 3 :"+firstThree+" Last 3:"+lastThree);

        //Find the count of Duplicate words in given String
        String string5="kartik";
        string5.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue))
                .forEach((k,v)->System.out.println(k+" "+v));



        //Find the Number starts with '2'
        List<Integer> list8=Arrays.asList(1,22,20,25,30,35);
      List<Integer> startwith_2= list8.stream().map(Object::toString).filter(i->i.startsWith("2")).map(Integer::valueOf).toList();
        System.out.println(startwith_2);


        //Find the missing Element
        int [] arr={1,2,3,4,5,6,8,9,10};
        Set set= new HashSet(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        IntStream.rangeClosed(1,arr.length-1).filter(i->!set.contains(i)).forEach(System.out::println);

        //Count the number of string which is stared by same character
        List<String> list9=Arrays.asList("Kartik","KarSingh","Gaurav");
        Map<Character,List<String>>list9ans=list9.stream().collect(Collectors.groupingBy(i->i.charAt(0)));
        System.out.println(list9ans);

        //Find the Palindrome string in given List
        List<String> list10=Arrays.asList("level","beeb","kartik");
        List<String> list10ans=list10.stream().filter(i->i.equals(new StringBuilder(i).reverse().toString())).toList();
        System.out.println(list10ans);

        //Sort the String according to their length
        List<String> list11=Arrays.asList("Kartik","Gaurav","Ram","KarSingh");
       List<String> list11ans= list11.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(list11ans);

        //Find the second highest Number in Given list
        int [] arst={5,9,11,2,8};
       int secondHighest= Arrays.stream(arst).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        //Find the Anagram and group them
        List<String> list12=Arrays.asList("cat","act","tea","eat");
       Map<String,List<String>>mapList12= list12.stream().collect(Collectors.groupingBy(i->{
            char[] list12ans= i.toCharArray();
            Arrays.sort(list12ans);
            return new String(list12ans);
        }));
        System.out.println(mapList12);

        //Convert string into Toggle String
        String string10="AnKusH";
        String string10asn=string10.chars().mapToObj(i->Character.isUpperCase(i)?Character.toLowerCase((char) i):Character.toUpperCase((char) i)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(string10asn);

        //Find the Number of Repeated words in given String
        String strLista="My name is is";
        Arrays.stream(strLista.split(" ")).collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));

        //In given List if we found number with is divisible by 3 the sqaure that number and other number print as it is
        int [] arrs={2,4,6,8,2,10,4,12,6};            // out put 2,4,36,8,2,10,4,144,36
        Arrays.stream(arrs).map(i->i%3==0?i*i:i).boxed().forEach(System.out::println);
        System.out.println("list");
        List<Integer> lstqw= new ArrayList<>(Arrays.asList(2,4,6,8,2,10,4,12,6));
        lstqw.stream().map(i->i%3==0?i*i:i).forEach(System.out::println);

        // in the given 2 listA and listB , findout common elements which are even
        List<Integer> listA= Arrays.asList(1,2,11,3,25,54,5,6,7,8);
        List<Integer> listB= Arrays.asList(3,4,5,6,9,1,54,2,25);
//        List<Integer>listC=listA.stream().filter(listB::contains).filter(i->i%2==0).toList();
//        System.out.println(listC);
        listA.stream().filter(listB::contains).collect(Collectors.groupingBy(i->{
            if(i%2==0){
                return "EVEN :";
            }else{
                return "ODD :";
            }
        })).forEach((k,v)->System.out.println(k+" "+v));

        // find out valid rotation on string
        // eg: valid rotate string of string "abcd" are "bcda","cdba","dabc"
        // eg: invalid rotate string of string "abcd" are "adbc","dacb","cabd",etc
        String a="abcd";
        String b= a+a;
        System.out.println(b.contains("bcda"));

//div by 6 and non div by 6 substraction
        List<Integer> listInt= Arrays.asList(1,2,3,5,6,98,6,7,9,9,98,98);
        Set<Integer> listSet= new HashSet<>(listInt);
        IntStream.rangeClosed(1,listInt.size()-1).filter(i-> !listSet.contains(i)).forEach(System.out::print);

        int nondiv=IntStream.rangeClosed(1,30).filter(i->i%6==0).sum();
        System.out.println(nondiv);
        int div= IntStream.rangeClosed(1,30).filter(i->i%6!=0).sum();
        System.out.println(div-nondiv);

        // 2 string anagram or not
        String listen="Listen";
        String silent="siLent";
        char[] a1 = listen.toCharArray();
        char[] a2 = silent.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));

        // sort list by last character
        List<String> strArr= Arrays.asList("Ankush","kartik","kunal","banana","apple");
        List<String> sortByLastChar= strArr.stream().sorted(Comparator.comparing(word->word.charAt(word.length()-1))).toList();
        System.out.println(sortByLastChar);

        String name="Ankush Bhalage";
        char[] charA=name.toCharArray();

        Set<Character> seen= new LinkedHashSet<>();
        StringBuilder s3= new StringBuilder();

        for(char result: charA){
            if(!seen.contains(result)){
                seen.add(result);
                s3.append(result);
                System.out.println(s3.toString());
            }
        }
        System.out.println(seen);
        System.out.println("hi "+s3.toString());

        
        //count list of vowels in each string from list
         List<String> list12=Arrays.asList("Ankush","Bhalage","Ramesh","Shantanu");
        Map<String,Long> lMap=list12.stream().collect(Collectors.toMap(i->i,j->j.toLowerCase().chars().filter(k->"aeiou".indexOf(k)!=-1).count()));
        System.out.println(lMap);

        // find prime numbers from a list
        List<List<Integer>> listList=Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9,11)
        );
        System.out.println(listList);
        List<Integer> primeNumbers= listList.stream().flatMap(List::stream).filter(i->isPrime(i)).toList();

        System.out.println(primeNumbers);

    }
     public static boolean isPrime(int num){
        System.out.println(num);
        if(num<=1) return false;
        return IntStream.rangeClosed(2,(int) Math.sqrt(num)).allMatch(n->num%n!=0);
    }


}
