package operator;

public class MultiDArray {

	public static void main(String[] args) {
		//declaring & initializing 2D array
		int arr[][]= {{2,5,6},{4,6,8},{1,2,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
