package operator;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;//primitive type
Integer i=Integer.valueOf(a);//converting into Integer
Integer j=a;//now compiler will write Integer.valueOf(a)autoboxing
System.out.println(a+" "+i+" "+j);}

}
