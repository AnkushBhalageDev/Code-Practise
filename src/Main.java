import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int buyMulSellMul(int []arr){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sum+=arr[i+1]-arr[i];
            }
        }
        return sum;
    }

    public static int buyOnceSellOnce(int [] arr){
        int sum=0;
        int minPrice= Integer.MAX_VALUE;
        for(int a:arr){
            if(a<minPrice){
                minPrice=a;
            }
          int profit=a-minPrice;
            if(profit>sum){
                sum=profit;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,8,9,10};
        Set<Integer> set= new HashSet<>(Arrays.stream(arr).boxed().toList());
        System.out.println(set);
        int a=IntStream.rangeClosed(1,set.size()).filter(i->!set.contains(i)).findFirst().getAsInt();
        System.out.println(a);
List<Integer> lista= Arrays.asList(1,2,4,5,6,8,9,10);
Set<Integer> seta=new HashSet<>(lista);
        List<Integer> list=IntStream.rangeClosed(1,seta.size()).filter(i->!set.contains(i)).boxed().collect(Collectors.toList());
        System.out.println(list);


        // sort list by last character
        List<String> strArr= Arrays.asList("Ankush","kartik","kunal","banana","apple");
       List<String>asdad= strArr.stream().sorted(Comparator.comparing(i->i.charAt(i.length()-1))).toList();
        System.out.println(asdad);
        // in the given 2 listA and listB , findout common elements which are even
        List<Integer> listA= Arrays.asList(1,2,11,3,25,54,5,6,7,8);
        List<Integer> listB= Arrays.asList(3,4,5,6,9,1,54,2,25);
        List<Integer>listcom=listA.stream().filter(listB::contains).toList();
        System.out.println(listcom);
       Map<String,List<Integer>>litasd= listA.stream().collect(Collectors.groupingBy(i->{
            if(i%2==0) return "EVEN";
            else return "ODD";
        }));
        System.out.println(litasd);








//fibonnacci series 0 1 1 2 3 5 8 13
        int c=0;
        int b=1;
        for (int i=2;i<10;i++){
            int d=c+b;
            System.out.print(" "+d);
            c=b;
            b=d;

        }



int[] arras={1,2,3,4,5,3,1};
        List<Integer> listas=Arrays.stream(arras).boxed().toList();
        int ab=listas.stream().collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1)
                .findFirst().get().getKey();
        System.out.println("Ankush"+ab);

        int []arr15={5,9,11,2,8};
        List<Integer>list15=Arrays.stream(arr15).boxed().toList();

        int secondHigh=list15.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHigh);




        String ams="AnKusH".chars().mapToObj(i->Character.isUpperCase(i)?Character.toLowerCase((char)i):Character.toUpperCase((char)i)).map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(ams);

        Map<String,Long> map18=Arrays.asList("My name is is".split(" ")).stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map18);


        int[]arrsa12={2,4,6,8,2,10,4,12,6};
        List<Integer> intList =Arrays.stream(arrsa12).boxed().map(i->i%3==0?i*i:i).toList();
        System.out.println(intList);
        int am[]={1,2,11,3,25,54,5,6,7,8};
        List<Integer> listAa = Arrays.stream(am).boxed().toList();
        int []B = {3,4,5,6,9,1,54,2,25};
        List<Integer> listBa=Arrays.stream(B).boxed().toList();
//        Map<String,List<Integer>>map13= listAa.stream().filter(listBa::contains).collect(Collectors.groupingBy(i->(i%2==0)?"EVEN":"ODD"));
        Map<String,List<Integer>>map13=listA.stream().filter(listBa::contains).collect(Collectors.groupingBy(i->{
            if(i%2==0){
                return "EVEN";
            }else{
                return"ODD";
            }
        }));
System.out.println(map13);

        String str1="abcd";
        String str2=str1+str1;
        System.out.println(str2.contains("bcda"));
        Map<Boolean,List<Integer>>map22=IntStream.rangeClosed(1,30).boxed().collect(Collectors.partitioningBy(i->i%6==0));

        System.out.println(map22.get(false).stream().mapToInt(Integer::intValue).sum()-map22.get(true).stream().mapToInt(Integer::intValue).sum());


        List<String> strList=Arrays.asList("Ankush","kartik","kunal","banana","apple").stream().sorted(Comparator.comparing(i->i.charAt(i.length()-1))).toList();
        System.out.println(strList);

        String m1="Ankush Bhalage";

        Set<Character> setchar= new LinkedHashSet<>();
        char[] car=m1.toCharArray();
        String amn="";
        for(char f:car){
            if(!setchar.contains(f)){
                setchar.add(f);
                amn+=f;
            }
        }
        System.out.println(amn);
int []arr1={1,3,4,1,5};
        System.out.println(buyOnceSellOnce(arr1));
        System.out.println(buyMulSellMul(arr1));
    }
}