package operator;

public class Copyconst {
//variable along with data type
	int age;
	String name;
	//constructor &initialize
	Copyconst (int a,String n){
		age = a;
		name=n;
	}
	//copy consructor to initialize another object
	/*Copyconst (Copyconst c){
		age = c.age;
		name=c.name;
	}*/
	Copyconst(){}  //with out
//method
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		Copyconst c1=new Copyconst (24,"Bidisha");
	//	Copyconst c2=new Copyconst (c1);
		Copyconst c2=new Copyconst ();
		c2.age=c1.age;
		c2.name=c1.name;
c1.show();
c2.show();
	}

}
