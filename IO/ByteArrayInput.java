package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInput {

	public static void main(String[] args) {
		byte[]array= {66,67,68,69,70};
		ByteArrayInputStream bos=new ByteArrayInputStream(array);
		int i;
		while((i=bos.read())!=-1) {
			char c=((char)i);
			System.out.println("ASCII character :"+ i  +"value is:"+c);
		}
	}}