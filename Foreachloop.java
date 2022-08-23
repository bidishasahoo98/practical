package operator;

public class Foreachloop {

	public static void main(String[] args) {
		//declaring array
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i :arr) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum is :"+sum);

	}

}
