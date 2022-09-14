package operator;
//parent class
class Shape2{
	//constructor of parent class

	public Shape2(){
		System.out.println("Hello");
	}}
	class Size2 extends Shape2{ //child class
		Size2(){ // constructor of child class
			super(); //invoke imidiate parent class constructor line no 10
		System.out.println("hi");}}

class Superconstructor {

	public static void main(String[] args) {
		Size2 ob=new Size2();
		}}
