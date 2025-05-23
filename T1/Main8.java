package T1;

import java.util.TreeSet;

public class Main8 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>();
        ts.add(new Teacher("zhangsan",15));
        ts.add(new Teacher("lisi",16));
        ts.add(new Teacher("ausy",16));
        System.out.println(ts);
    }

}
class Teacher implements Comparable{
   String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public int compareTo(Object obj) {
//        Teacher t=(Teacher) obj;
//        if(this.age>t.age) return this.age-t.age;
////        年龄升序
//        if(t.age==this.age) return this.name.compareTo(t.name);
////        name升序
//
//        return -1;
//    }
    @Override
    public int compareTo(Object obj) {
        Teacher t=(Teacher) obj;
        if(this.age>t.age) return this.age-t.age;
        if(this.age==t.age) return t.name.compareTo(this.name);
        return -1;
    }

}
