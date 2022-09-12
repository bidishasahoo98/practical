package operator;

class Operation {
int square(int a) {
	return a*a;
}}
public class Shape_hasA{
	Operation ref;
float pi=3.14f;
double area(int radius) {
	ref=new Operation();
	int square1=ref.square(radius);
	return pi*square1;
}
public static void main(String...args) {
	Shape_hasA c=new Shape_hasA();
	double result= c.area(6);
	System.out.println(result);
}
}