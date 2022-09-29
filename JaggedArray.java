package operator;
//jagged array using java prog
public class JaggedArray {

	public static void main(String[] args) {
		// declare 2D array
		int arr[][]=new int[3][];
		//5+7+9=21
		arr[0]=new int[5];// 0 index print 5 elements
		arr[1]=new int[7];
		arr[2]=new int[9];
//initialized the jagged
		int count=0;
		for(int i=0;i<arr.length;i++) //row
			for(int j=0;j<arr[i].length;j++) //coloumn
				arr[i][j]=count++;
		//print the jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}}}

