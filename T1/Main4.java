package T1;

import java.text.Collator;
import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("Jack");
        list1.add("Mary");
        list1.add("Zach");
        list1.add("Henry");
        list1.add("Davey");
        list1.add("Edward");
        System.out.println("ArrayList"+list1);
        LinkedList list2 = new LinkedList();
        list2.add("Jack");
        list2.add("Mary");
        list2.add("Henry");
        list2.add("Davey");
        list2.add("Jack");
        list2.add("Mary");
        System.out.println("LinkedList"+list2);
        HashSet list3 = new HashSet();
        list3.add("Jack");
        list3.add("Mary");
        list3.add("Henry");
        list3.add("Davey");
        list3.add("Jack");
        list3.add("Mary");
        System.out.println("HashSet"+list2);

        TreeSet list4 = new TreeSet();
        list4.add("Jack");
        list4.add("Mary");
        list4.add("Henry");
        list4.add("Davey");
        list4.add("Jack");
        list4.add("Mary");
        System.out.println("TreeSet"+list4);

        Comparator pinyin=new Comparator() {
            Collator c=Collator.getInstance(Locale.CHINA);
            @Override
            public int compare(Object o1, Object o2) {
                return c.compare(o2,o1);
//                添加负号为降序
//                o2，o1 为降序
//                o1,o2为升序

            }
        };
        TreeSet list5 = new TreeSet(pinyin);
        list5.add("张晓莉");
        list5.add("赵大强");
        list5.add("艾梅花");
        list5.add("刘勇");
//        list5.add("Zin");
//        list5.add("Mary");
        System.out.println("TreeSet"+list5);

    }
}
