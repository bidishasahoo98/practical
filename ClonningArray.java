package operator;

public class ClonningArray {

	public static void main(String[] args) {
		int[] arr= {44,4,5,6};
		System.out.println("print the actual array");
		for(int i:arr)//for each loop for print
			System.out.println(i);//print
		System.out.println("print the clone array");
		int carr[]=arr.clone();//creating clone
		for(int i:carr)//for each loop for cloning
			System.out.println(i);
		System.out.println("both are equal or not?");
		System.out.println(arr==carr);//checking for location
		}}
