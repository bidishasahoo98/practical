package demo;

public class GetterMethod {
private String name="Tusi";
public String getName() {
	return name;
}
}
class Main{
	public static void main(String[]args) {
		GetterMethod ob=new GetterMethod();
	//ob.setName("Bittu");
//we can't change the value of the name
		System.out.println(ob.getName()); //only for read
	}
}