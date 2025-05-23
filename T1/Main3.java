package T1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add(19);
        list.add(1);
        list.add(19);
        list.add(1);
        list.add(1);
        list.add(13);
        System.out.println("ArrayList"+list);
        LinkedList list2= new LinkedList();
        list2.add(19);
        list2.add(1);
        list2.add(19);
        list2.add(1);
        list2.add(1);
        list2.add(13);
        System.out.println("LinkedList"+list2);
//        原样输出
        HashSet list3 = new HashSet();
        list3.add(19);
        list3.add(1);
        list3.add(19);
        list3.add(1);
        list3.add(1);
        list3.add(13);
        System.out.println("HashSet"+list3);
//        去重复但不升序
        TreeSet list4 = new TreeSet();
        list4.add(13);
        list4.add(8);
        list4.add(17);
        list4.add(17);
        list4.add(1);
        list4.add(11);
        list4.add(15);
        list4.add(25);
        System.out.println("TreeSet"+list4);
//        升序且去重复
    }
}
