package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class BufferedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//write byte
			FileInputStream f=new FileInputStream("D:\\test.txt");//destination
			BufferedInputStream bos=new BufferedInputStream(f);
			int i;
			while((i=bos.read())!=-1) {
			System.out.print((char)i);}
			f.close();
			bos.close();
			System.out.println("\ndone");
		}catch(Exception e) {
			System.out.println(e);
		}
			}}

