package operator;
//achieve multiple inheritance using interfaceS
 interface Demo2 { //1st interface
void show();
}
interface Demo3{ //2nd interface
	void print();
}
 class NewDemo implements Demo2,Demo3{
	public void show() {
		System.out.println("show");
	}
	public void print() {
		System.out.println("print");
	}
public static void main(String[]args) {
	NewDemo ob=new NewDemo();
	ob.show();
	ob.print();
}}