//method overloading:changing data type of argument

package operator;

public class Addition { //class
	static int add(int a,int b) { //no of argument 2 add is a method
return(a+b);}
	static double add(double a,double b) { //no of argument 2 add is a method
		return(a+b);}

	class overloading{//main class
	public static void main(String[] args) {
		System.out.println(Addition.add(10,15));
		System.out.println(Addition.add(10.6,15.4));

	}}}


