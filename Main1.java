package T3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws Exception{
        FileInputStream in =new FileInputStream("aaa/in.txt");
        int b=0;
        while(true){
            b=in.read();
            if(b==-1){
                break;
            }
            System.out.println(b);
        }
        in.close();
//        System.out.println(in.read());
    }
}
