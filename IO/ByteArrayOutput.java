package IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutput {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			FileOutputStream f=new FileOutputStream("D:\\test.txt");//destination
			FileOutputStream f1=new FileOutputStream("D:\\test1.txt");//destination
               bos.write(65);
               bos.writeTo(f);
               bos.writeTo(f1);
			   bos.close();
			       System.out.println("Welldone");
		    }catch(Exception e) {
			       System.out.println(e);
		}}}
