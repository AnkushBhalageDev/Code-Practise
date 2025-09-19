import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImpl {
    record Employee(int id,String name,int salary){    }

    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(1,"Ankush",20000));
        empList.add(new Employee(3,"Shrikanta",15000));
        empList.add(new Employee(2,"Ram",21000));

        // sort employee by last character of name
        List<Employee> sortByLastCharOfName= empList.stream().sorted(Comparator.comparing(emp->emp.name.charAt(emp.name.length()-1))).toList();
        System.out.println(sortByLastCharOfName);

        // sort by salary
        List<Employee> sortBySalary= empList.stream().sorted(Comparator.comparing(Employee::salary).reversed()).toList();
        System.out.println(sortBySalary);

        // group by salary
        Map<String,List<Employee>> groupbySalary= empList.stream().collect(Collectors.groupingBy(i->{
            if(i.salary>15000 && i.salary<20000){
                return "15k - 20k";
            } else if (i.salary>20000 && i.salary<30000) {
                return "20k - 30k";
            }else {
                return "None";
            }
        }));
        System.out.println(groupbySalary);

    }
}
