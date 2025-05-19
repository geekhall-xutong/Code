package T1;

import java.util.HashSet;

public class Main5 {
    public static void main(String[] args) {
        HashSet <Person> h1= new HashSet();
        h1.add(new Person("Jack", 25));
        h1.add(new Person("Rose", 25));
        h1.add(new Person("Jack", 27));
        h1.add(new Person("Rose", 25));

        System.out.println(h1.toString());
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person p=(Person)obj;
        return p.name.equals(this.name);
//        名字相同则舍去
    }

    @Override
    public String toString() {
        return
               name + "::" +
                age;
    }
}