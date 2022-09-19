package operator;

public abstract class Abstaction { //parent class
abstract void method(); //abstract method
}
class Test1 extends Abstaction{ //child class
	void method() { //non abstract method
System.out.println("method running successfully");;
	}
}
class NewTest extends Abstaction{
	void method() {
		System.out.println("hihi");
	}
	public static void main(String[] args) {
       Abstaction ab=new NewTest();
          ab.method();
	}

}


