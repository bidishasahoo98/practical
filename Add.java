package operator;

public class Add {
 static int add(int a,int b) {
	 return a+b;
 }
 static int add(int a,int b,int c) {
	 return a+b+c;
 }}
 class Test{
	public static void main(String[] args) {
		System.out.println(Add.add(2,2));
		System.out.println(Add.add(2,2,3));

	}
 }
