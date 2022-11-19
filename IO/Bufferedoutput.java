package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferedoutput {

	public static void main(String[] args) {
		try {
			//write byte
			FileOutputStream f=new FileOutputStream("D:\\test.txt");//destination
			BufferedOutputStream bos=new BufferedOutputStream(f);
			/*f.write(67);
			 f.close();
			 System.out.println("done");*/
			//write string
			String s="I am good";
			byte b[]=s.getBytes();//converting string into byte array
			f.write(b);
			f.close();
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e);
		}
			}

		}

	
