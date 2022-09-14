package operator;

class Shape1 {                           //parent class

void print() {                          //parent class method
	System.out.println("print circle");
}}
class Size1 extends Shape1{             //child class
	void print() {   //same method of parent class(child class )method
		System.out.println("print triangle");}
		void display() {
			System.out.println("print nothing");
		}
		void show() {
			display();
		super.print();
	}}

class Superkeyword{
	public static void main(String[] args) {
		Size1 ob= new Size1();
		ob.show();

	}}

