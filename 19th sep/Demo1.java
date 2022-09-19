package operator;

public interface Demo1 { //interface declaration
void display();
}
class DemoTest implements Demo1{ //1st implementation
	public void display() {
		System.out.println("Display");
	}}
	class DemoTest1 implements Demo1{ //2nd implementation
		public void display() {
			System.out.println("Display 1");
		}
public static void main(String[] args) {
	Demo1 ob =new DemoTest1();
	ob.display();
}}
