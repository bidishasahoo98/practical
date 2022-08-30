//display default value
package operator;

public class Defaultconstructor {
String name;
int age;
void show() { //method to display age and name
	System.out.println(age+" "+name);
}
	public static void main(String[] args) {
		
		Defaultconstructor ob=new Defaultconstructor();
		Defaultconstructor ob1=new Defaultconstructor();
	ob.show();
	ob1.show();
}}
