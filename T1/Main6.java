package T1;

import java.util.HashSet;
import java.util.Objects;

public class Main6 {
    public static void main(String[] args) {
        HashSet <Student> h1=new HashSet();
        h1.add(new Student("jerry",1,18));
        h1.add(new Student("jerry",1,19));
        h1.add(new Student("jerry",2,18));
        h1.add(new Student("Potter",2,18));
        h1.add(new Student("Harry",3,18));
        System.out.println(h1);

    }
}
class Student{
    String name;
    int id;
    int age;

    @Override
    public int hashCode() {
        Integer i=id;
        return i.hashCode();
    }


    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 仅比较id和name
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name);
    }


    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
