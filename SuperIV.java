package operator;

 class Shape {//parent class
String name="circle";// data member of parent class
}
 class Size extends Shape{//child class
	 String name="Triangle"; // data member of child class
 void showname() {//method
	 System.out.println(name);//display the name of the Size class
	 System.out.println(super.name);//display the name of the shape class
 }}
 class SuperIV{
	public static void main(String[] args) {
		Size ob= new Size();
		ob.showname();

	}

}
