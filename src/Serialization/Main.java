package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee em= new Employee("Ankush",26);
        Employee e2= new Employee("kartik",31);
        List<Employee> empList= new ArrayList<>();
        empList.add(em);
        empList.add(e2);
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.text"))) {
//            out.writeObject(empList);
            for (Employee e : empList) {
                out.writeObject(e);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        try (
//                BufferedReader reader= new BufferedReader(new FileReader("emp.text"))
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.text"))
        ){
//            String s=reader.readLine();
//            System.out.println(s);
           List <Employee> e = (List<Employee>) in.readObject();
            System.out.println(e);
        }catch (Exception f){
            System.out.println(f);
        }
        
        List list= new ArrayList();
        list.add(12);
        list.add("ankush");
        list.forEach(i->System.out.println(i.toString()));
    }
}
