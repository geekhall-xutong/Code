package T1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

            LinkedList<String> list =new LinkedList();
            list.add("stu2");
            list.add("stu1");
            list.add("stu5");
            list.add("stu4");
            list.add("stu3");
            list.addFirst("stu7");
        System.out.println(list.getFirst());
            System.out.println(list);
            list.add(2,"stu6");
            list.remove(1);
            list.remove("stu2");
            System.out.println(list);
            System.out.println(list.indexOf("stu6"));
            System.out.println("for循环");

            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println("foreach循环");
            for(String str:list){
                System.out.print(str+" ");
            }
            System.out.println("foreach方法");
            list.forEach(s-> System.out.print(s+" "));
            System.out.println("Iterator迭代器");
            Iterator<String> it1 = list.iterator();
//        ctrl+alt+v
            while(it1.hasNext()){
                System.out.print(it1.next() + " ");
            }
            System.out.println("迭代器对象的forEachRemaing方法");
            Iterator<String> it2 = list.iterator();
            it2.forEachRemaining(s -> System.out.print(s+" "));


        }

    }
