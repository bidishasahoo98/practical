package operator;

class Finalvariable { //final variable
	final int value=50;
void display() {
	//we can't change the value of final variable
	int value=70; // if don't use int then compile time error
	System.out.println(value);
}
	
	public static void main(String[] args) {
		Finalvariable fv=new Finalvariable();
		fv.display();

	}
}
