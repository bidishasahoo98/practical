package operator;
//collection framework(array list)

import java.util.ArrayList;

public class Autoboxingeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a1=new ArrayList<Integer> ();
		//creating an empty array list of integer type
	a1.add(1);//adding the int primitive type value by using add() method
	a1.add(2);
	a1.add(3);//autoboxing
	System.out.println("ArrayList:"+a1);}

}
