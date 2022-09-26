package operator;

public class Array {

	public static void main(String[] args) {
	/* int a[]=new int[3]; //declaration array and object creation
	//initialization
	a[0]=10; 
    a[1]=20;
    a[2]=30; */
		
int a[]={10,20,30};  //initialize declare and object creation

    //traversing array
    for(int i=0;i<a.length;i++) 
    	//traversing array used for each loop
    	
    	System.out.println(a[i]);
    for(int i:a)
    System.out.println(i);
    }
	}


