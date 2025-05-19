package T1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main7 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(Comparator.reverseOrder());
        ts.add(7);
        ts.add(9);
        ts.add(44);
        ts.add(8);
        ts.add(1);
        ts.add(22);
        System.out.println(ts);
        TreeSet ts2 = new TreeSet();
        ts2.add('v');
        ts2.add('a');
        ts2.add('x');
        ts2.add('u');
        System.out.println(ts2);
        TreeSet ts3 = new TreeSet(Comparator.reverseOrder());
        ts3.add("jone");
        ts3.add("zoom");
        ts3.add("mondy");
        ts3.add("unty");
        ts3.add("jone");
        System.out.println(ts3);



    }
}
