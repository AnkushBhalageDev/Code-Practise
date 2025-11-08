import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeImpl {
    record Employee(int id,String name,int salary,String dept){    }

    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
//        empList.add(new Employee(1,"Ankush",20000,"IT"));
//        empList.add(new Employee(3,"Shrikanta",15000,"HR"));
//        empList.add(new Employee(4,"Shyam",25500,"IT"));
//        empList.add(new Employee(2,"Ram",21000,"HR"));
        // HR Department
        empList.add(new Employee(1,"Amit",25000,"HR"));
        empList.add(new Employee(2,"Ram",21000,"HR"));
        empList.add(new Employee(3,"Neha",23000,"HR"));
        empList.add(new Employee(4,"Vikas",24000,"HR"));
        empList.add(new Employee(5,"Priya",22000,"HR"));

// IT Department
        empList.add(new Employee(6,"Rohan",35000,"IT"));
        empList.add(new Employee(7,"Sita",36000,"IT"));
        empList.add(new Employee(8,"Arjun",34000,"IT"));
        empList.add(new Employee(9,"Meena",37000,"IT"));
        empList.add(new Employee(10,"Karan",33000,"IT"));

// Finance Department
        empList.add(new Employee(11,"Anil",28000,"Finance"));
        empList.add(new Employee(12,"Sunita",29000,"Finance"));
        empList.add(new Employee(13,"Rajesh",30000,"Finance"));
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


        // sort employee by last character of name
        List<Employee> sortByLastCharOfName= empList.stream().sorted(Comparator.comparing(emp->emp.name.charAt(emp.name.length()-1))).toList();
        System.out.println(sortByLastCharOfName);

        //employee with second highest salary
        Employee e1=empList.stream().sorted(Comparator.comparing(Employee::salary).reversed()).skip(1).findFirst().get();
        System.out.println(e1);

        //Employee whose name starts with s
        System.out.println("Employee whose name starts with s");
         empList.stream().filter(i->i.name.startsWith("S")).forEach(System.out::println);

        // sort by salary
        System.out.println("Sort emp list by salary");
        List<Employee> sortBySalary= empList.stream().sorted(Comparator.comparing(Employee::salary).reversed()).toList();
        System.out.println(sortBySalary);



        // group by salary
        Map<String,List<Employee>> groupbySalary= empList.stream().collect(Collectors.groupingBy(i->{
            if(i.salary>15000 && i.salary<20000){
                return "15k - 20k";
            } else if (i.salary>20000 && i.salary<30000) {
                return "20k - 30k";
            } else if (i.salary>30000 && i.salary<40000) {
                return "30k - 40k";
            }
            else {
                return "None";
            }
        }));
        System.out.println(groupbySalary);


        //  find top 3 highest paid employee from each dept
        empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors
                .collectingAndThen(Collectors.toList(),list->list.stream()
                        .sorted(Comparator.comparing(Employee::salary).reversed()).limit(3).toList())))
                .forEach((k,v)->System.out.println(k+" =>"+v));
        Map<String,List<Employee>> mpEmp=empList.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.collectingAndThen(Collectors.toList(),list->list.stream().sorted(Comparator.comparing(Employee::salary).reversed()).limit(3).toList())));




        Employee e=empList.stream().sorted(Comparator.comparing(Employee::salary).reversed()).skip(1).findFirst().get();
        System.out.println(e);

       Map<String,Optional<Employee>>mape= empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),list->list.stream().max(Comparator.comparing(Employee::salary)))));
        System.out.println(mape);

        System.out.println("3 highest paid");
        System.out.println(mape);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(empList);
        Collections.sort(empList,(e3,e2)->e3.name().compareTo(e2.name()));
        System.out.println(empList);
        Collections.sort(empList,(e4,e5)->e4.id());
// find dept with more than 2 employees
        List<String> deptWithMoreThan2Emp= empList.stream().collect(Collectors.groupingBy(emp1->emp1.dept,Collectors.counting())).entrySet().stream()
                .filter(i->i.getValue()>2).map(Map.Entry::getKey).toList();
        System.out.println("Find departments with more than 2 employees");
        System.out.println(deptWithMoreThan2Emp);
// find out maxaverage salary from dept
        Map<String,Double> maxAvgSal=empList.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.averagingDouble(Employee::salary))).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(maxAvgSal);
    }
}
