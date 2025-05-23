package T3;

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws Exception {
       long start1= System.currentTimeMillis();
        FileInputStream in1=new FileInputStream("source/FJ.jpg");
        FileOutputStream out1=new FileOutputStream("target/target1.jpg");
        int b;
        while((b=in1.read())!=-1){
            out1.write(b);
        }
        in1.close();
        out1.close();
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1+"ms");

        long start2= System.currentTimeMillis();
        FileInputStream in2=new FileInputStream("source/FJ.jpg");
        FileOutputStream out2=new FileOutputStream("target/target2.jpg");
        int len;
        byte[] buf=new byte[1024];
        while((len=in2.read(buf))!=-1){
            out2.write(buf, 0, len);

        }
        in2.close();
        out2.close();

        long end2=System.currentTimeMillis();
        System.out.println((end2-start2)+"ms");



        long start3= System.currentTimeMillis();
        FileInputStream in3=new FileInputStream("source/FJ.jpg");
        FileOutputStream out3=new FileOutputStream("target/target3.jpg");
        BufferedInputStream bis=new BufferedInputStream(in3);
        BufferedOutputStream bos=new BufferedOutputStream(out3);
        int c;
        while((c=bis.read())!=-1){
         bos.write(c);
        }
        bis.close();
        bos.close();
        in3.close();
        out3.close();

        long end3=System.currentTimeMillis();
        System.out.println(end3-start3+"ms");
    }
}
