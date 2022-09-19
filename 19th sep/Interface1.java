package operator;

public interface Interface1 {
 //creating interface
		//by default all methods in interface public and abstract 
		void show();
		void display();
		void print();
		}
		//creating abstract class that implements one of the methhod of Abstraction
		abstract class AbsClass implements Interface1 { 
			public void show() {
				System.out.println("hi");
			}
		}
		//creating sub class of abstract class that implements rest of the method
		class Class2 extends AbsClass{
			public void display() {
				System.out.println("hlw");
			}
			public void print() {
				System.out.println("bye");
			}
		}
		 class JAva{
			public static void main(String[]args) {
				Interface1 ob =new Class2();
				ob.show();
				ob.print();
				ob.display();
				
			}
		}
