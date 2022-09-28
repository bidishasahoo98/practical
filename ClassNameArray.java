package operator;
//to get the class name of array in java
public class ClassNameArray {

	public static void main(String[] args) {
		 //declaration & initialization of an array
		int arr[]= {1,2,3};
		//getting the class name
		Class c=arr.getClass();
		String name=c.getName();
		//print the class name
		System.out.println(c);

	}

}
