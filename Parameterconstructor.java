package operator;

public class Parameterconstructor {

	 String name;
     int age;
     Parameterconstructor(int a, String n) { //parameterized constructor where we have to pass the value
	   age=a;
	   name=n;}
     void show() {
    	 System.out.println(age+" "+name);
}
	public static void main(String[] args) {
		
		Parameterconstructor ob=new Parameterconstructor(25,"Sid");
		Parameterconstructor ob1=new Parameterconstructor(15,"Bittu");
	      ob.show();
	      ob1.show();


	}

}
