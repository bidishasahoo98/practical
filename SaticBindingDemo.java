package operator;
/* //variable have a type
public class SaticBindingDemo {
int a=30;//a is a int type of variable
//reference have a type
SaticBindingDemo sbd;
//object have a type
SaticBindingDemo s=new SaticBindingDemo ();*/

public class SaticBindingDemo {
	private void show() {
		System.out.println("Static Binding");
	}
	public static void main(String[] args) {
		SaticBindingDemo ob= new SaticBindingDemo();
		ob.show();

	}

}
