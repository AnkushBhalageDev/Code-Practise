package Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students=List.of(
                new Student("A",List.of(new Subject("Science",25),new Subject("Hindi",36))),
                new Student("B",List.of(new Subject("Hindi",65),new Subject("Math",35))),
                new Student("B",List.of(new Subject("Hindi",56),new Subject("Hindi",61)))
        );
        Set<Student> studentsSet= new HashSet<>(students);
        students.forEach(System.out::println);
        studentsSet.forEach(System.out::println);

       String subName= students.stream().flatMap(student -> student.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .get().getKey();
        System.out.println(subName);



        //kartik123singh
        String name="kartik123singh";
        int sum=name.chars().filter(Character::isDigit).map(i->i-'1').sum();
        System.out.println(sum);

        int []arr={2,7,11,15};
        int suma=0;
        int target=13;
        boolean flag=false;
        for(int i=0;i<=arr.length-1;i++){
            for(int j= arr.length-1;j>=0;j--){
                suma=arr[i]+arr[j];
             if(suma==target){
                 System.out.println(i+1+" "+j+1);
                 flag=true;
                 break;

             }

            }
            if(flag){
                break;
            }
        }
        String hayStack="sadbutsad";
        String niddle="sad";
        System.out.println(hayStack.indexOf(niddle));
    }
}
