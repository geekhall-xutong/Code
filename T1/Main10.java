package T1;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeMap;

public class Main10 {
    public static void main(String[] args) {

        TreeMap tmp = new TreeMap();
        tmp.put(1,"Lucy");
        tmp.put(2,"Asisa");
        tmp.put(5,"Luck");
        tmp.put(4,"Zin");

//        使用Set集合的iterator()方法获得Interator对象
Iterator it = tmp.keySet().iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        tmp.forEach((k,v)-> System.out.print(k+" "+v+" "));


        System.out.println(tmp);
        System.out.println(tmp.keySet());
        System.out.println(tmp.get(2));
        System.out.println(tmp.values());
    }
}
