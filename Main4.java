package T3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
//        FileWriter writer= new FileWriter("aaa/in.txt",true);
//        String str="新余学院欢迎你！";
//        writer.write(str);
//        writer.close();

        FileWriter writer2= new FileWriter("aaa/in.txt",true);
        String str2="登鹳雀楼\n" +
                "王之涣王之涣〔唐代〕\n" +
                "\n" +
                "白日依山尽，黄河入海流。\n" +
                "欲穷千里目，更上一层楼。\n";
        writer2.write(str2);
        writer2.close();


    }
}
