package org.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=IOTest.class)
public class IOTest {

    private static  final  String LINE_SEPARATOR = System.getProperty("line.separator");
    @Test
    public void IOCdeTest () {
        try {
            FileWriter fileWriter = new FileWriter("demo01.text");
            FileWriter fileWriter1 = new FileWriter("demo02.xml");
            FileWriter fileWriter2 = new FileWriter("demo03.xml");
            fileWriter.write("today01"+LINE_SEPARATOR+"DAF01");
            fileWriter1.write("Hello World");
            fileWriter2.write("a");

            fileWriter.close();
            fileWriter1.close();
            fileWriter2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     @Test
    public void readTest () {
         try {
             FileReader fr = new FileReader("demo03.xml");
             int read = fr.read();
             int read1 = fr.read();
             System.out.println("read:"+ read);
             System.out.println("read:"+ read1);
             fr.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

     @Test
    public void buffWriter () {
         try {
             FileWriter filterWriter = new FileWriter("demo04.text");
             // filterWriter.write("12345"+LINE_SEPARATOR+"info");
             // filterWriter.write("rainbow");
             BufferedWriter bufferedWriter = new BufferedWriter(filterWriter);
             bufferedWriter.write("shfsjhfskfhsfkjh");
             bufferedWriter.newLine();
             bufferedWriter.write("nextLIne");
             bufferedWriter.flush();
             bufferedWriter.close();
             // filterWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

     @Test
    public void InputTest () throws IOException{
         FileInputStream fi = new FileInputStream("E:/音乐/浪子回头.mp3");
         FileOutputStream fo = new FileOutputStream("E:/音乐/copy.mp3");
         int len  = 0;
         byte[] buff = new byte[1024];
         while ((len = fi.read())!=-1) {
             fo.write(buff,0,len);
       }
       fi.close();
       fo.close();
     }

    @Test
    public void InputBuffTest () throws IOException{
        FileInputStream ins = new FileInputStream("E:/音乐/浪子回头.mp3");
        BufferedInputStream inBuff = new BufferedInputStream(ins);
        FileOutputStream fo = new FileOutputStream("E:/音乐/copy.mp3");
        BufferedOutputStream outBuff = new BufferedOutputStream(fo);
        int len  = 0;
        byte[] buff = new byte[1024];
        while ((len = inBuff.read(buff))!=-1) {
            outBuff.write(buff,0,len);
        }
        inBuff.close();
        outBuff.close();
    }
}
