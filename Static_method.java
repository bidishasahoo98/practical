package operator;


public class Static_method { //class1
	int rollno;
	String name;
	float fee;
	static String college="MSIT";
	static void change(){ //static method(no need to create an object)
	college="HIT";
	}
//constructor
	Static_method(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvariable { //class2
	public static void main(String[] args) {
		Static_method.change();
		//objects
		 Static_method s1= new Static_method(109,"Bidisha",42000);
		 Static_method s2= new Static_method(109,"Sid",42500);
		 s1.display();
		 s2.display();
	}}}

