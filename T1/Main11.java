package T1;

import java.util.Scanner;
import java.util.TreeMap;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int value;
        TreeMap ts = new TreeMap();
        for(int i = 0; i < str.length(); i++){
            String s=str.substring(i,i+1);
            if(ts.containsKey(s)){
                value=(int)ts.get(s);
                ts.put(s,++value);
            }else{
                ts.put(s,1);
            }
        }
        ts.forEach((k,v)-> System.out.println(k+":"+v));


    }
}
