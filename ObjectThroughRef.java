package operator;
class Ref{ //field
	int age;
	String name;
}

public class ObjectThroughRef {  //create another class

	public static void main(String[] args) {   //main method
		//initialized object by refference
		Ref ob=new Ref();
		Ref ob1=new Ref();
		Ref ob2=new Ref();
		ob.age=25;
		ob.name="Sid";
		ob1.age=24;
		ob1.name="Bidi";
		ob2.age=14;
		ob2.name="Bittu";
		//print it
		System.out.println(ob.name+ " is now " + ob.age);
		System.out.println(ob1.name+ " is now " + ob1.age);
		System.out.println(ob2.name+ " is now " + ob2.age);
	}

}

