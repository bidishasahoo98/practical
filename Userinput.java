package operator;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner class
		System.out.println("Enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number:");
		int c=sc.nextInt();
		int d=a+b+c;
		System.out.println("Total: "+d);

	}

}

