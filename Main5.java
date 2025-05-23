package T3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {


    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("aaa/in.txt");
        int ch;
        while((ch= reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();

        FileReader reader2=new FileReader("aaa/out.txt");
        int ch2;
        while((ch2= reader2.read())!=-1){
            System.out.print((char)ch2);
    }
        reader2.close();




    }


}
