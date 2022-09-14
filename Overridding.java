package operator;

public class Overridding {//parent class
	void run() { //method
		System.out.println("running mode on");
	}}
//creating child class
	class Testoverridding extends Overridding{
//defining same name method as it declared in the parent class
	void run() { //method
		System.out.println("running mode off");
	}
		public static void main(String[] args) {
			//creating object of child class
			Testoverridding ob=new Testoverridding();
         ob.run();
	}
}
