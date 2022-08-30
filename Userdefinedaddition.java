package operator;

import java.util.Scanner;

public class Userdefinedaddition {

	public static void main(String[] args) {
		// create scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number :");
		//taking input from user
      int num1=sc.nextInt();
      int num2=sc.nextInt();
//method
      addition(num1,num2);
	}//user defined method
	public static void addition(int num1,int num2) {
		//method body
		int c=num1+num2;
		System.out.println("Addition of two number is:"+c);
	}
	}
