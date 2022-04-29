package test;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriter1 {

    public static void main(String[] args) throws IOException {

        CharArrayWriter charArrayWriter=new CharArrayWriter();
        charArrayWriter.write("This is Narender and it's CharArrayWriter Example");
        FileWriter fi=new FileWriter("C:\\Users\\naren\\OneDrive\\Desktop\\temp.txt");
        FileWriter fi1=new FileWriter("C:\\Users\\naren\\OneDrive\\Desktop\\temp1.txt");
        FileWriter fi2=new FileWriter("C:\\Users\\naren\\OneDrive\\Desktop\\temp2.txt");

        charArrayWriter.append("FunnyAnny",1,8);
        charArrayWriter.writeTo(fi);
        charArrayWriter.writeTo(fi1);
        charArrayWriter.writeTo(fi2);
        char[] arr=charArrayWriter.toCharArray();
        System.out.println(arr);
        fi.close();
        fi1.close();
        fi2.close();
        System.out.println("Write successful");
    }
}
