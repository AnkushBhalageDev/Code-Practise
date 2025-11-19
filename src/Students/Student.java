package Students;

import java.util.List;
import java.util.Objects;

public class Student {
    String name;
    List<Subject>  subjects;

    public Student(){}
    public Student (String name,List<Subject> subjects){
        this.name=name;
        this.subjects=subjects;
    }
    public List<Subject> getSubjects(){
        return this.subjects;
    }
    public String toString(){
        return "Student Name: "+this.name+", Subjects :"+this.subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class Subject{
    String name;
    int marks;
    public Subject(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "name : "+this.name+", marks : "+this.marks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return marks == subject.marks && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
