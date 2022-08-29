package operator;

class Me{
	int age;
	String name;
void input(String n,int a) { //insert records method1
	age=a;
	name=n;
}
void display() {  //method 2 display result
	System.out.println(name+ " is now "+age +" years old. ");
}

public class Object_method {

	public static void main(String[] args) { //main method
		//initialized object by refference
		Me ob=new Me ();
		Me ob1=new Me ();
		ob.input("Ariya",2);
		ob1.input("Adi",5);
		//print it
		ob.display();
		ob1.display();
		
	}}}
