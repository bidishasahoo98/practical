package operator;

import java.util.Scanner;

public class Userdefinedmethod {

	public static void main(String[] args) {
		// create scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		//taking input from user
      int num=sc.nextInt();
//method
      checkEvenOdd(num);
	}//user defined method
	public static void checkEvenOdd(int num) {
		//method body
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num + " is odd");
	}
}
