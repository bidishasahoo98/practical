package IO;

import java.io.FileOutputStream;

public class WriteByteFos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//write byte
	FileOutputStream f=new FileOutputStream("D:\\test.txt");//destination
	/*f.write(67);
	 f.close();
	 System.out.println("done");*/
	//write string
	String s="Welcome";
	byte b[]=s.getBytes();//converting string into byte array
	f.write(b);
	f.close();
	System.out.println("done");
}catch(Exception e) {
	System.out.println(e);
}
	}

}
