//find out sum of positive numbers
package operator;

import java.util.Scanner;

public class Dowhile_test {

	public static void main(String[] args) {
int sum=0;
Scanner input = new Scanner(System.in);//scanner class
//take input from user
System.out.println("Enter the numbers");
int number=input.nextInt();
while(number >= 0) {
	//add only positive number
	sum+=number;
	System.out.println("Enter the numbers");
	number=input.nextInt();
}
System.out.println("sum is :"+sum);
input.close();

	}

}
