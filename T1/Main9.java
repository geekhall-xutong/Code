package T1;

import java.util.LinkedHashMap;
import java.util.Set;

public class Main9 {
    public static void main(String[] args) {
        LinkedHashMap hm1 = new LinkedHashMap();
        hm1.put("Potter",100);
        hm1.put("Lisa", 90);
        hm1.put("Lisa", 80);
        hm1.put("Harry", 50);
        hm1.remove("Harry");
        Set s1=hm1.keySet();
        for(Object k:s1){
            System.out.println(hm1.get(k));
        }
        hm1.forEach((k,v)-> System.out.println(k+"::"+v));


        System.out.println(hm1);
        System.out.println(hm1.get("Lisa"));
        System.out.println(hm1.values());
        System.out.println(hm1.entrySet());


    }
}
