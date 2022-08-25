package operator;

import java.util.Scanner;

public class Dowhiletest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int number=0;
		Scanner input = new Scanner(System.in);//scanner class
		//take input from user
		//System.out.println("Enter the numbers");
		//int number=input.nextInt();
		do {
			//add only positive number
			sum+=number;
			System.out.println("Enter the numbers");
			number=input.nextInt();
		}while(number>=0);
		System.out.println("sum is :"+sum);
		input.close();
	}

}
