package operator;

public class Overloadingtypepromotion { //class
	void add(int a,int b) {//method 1
		System.out.println(a+b);
	}
	void add(long a,long b) {//method 2
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Overloadingtypepromotion ob=new Overloadingtypepromotion();
		ob.add(20, 30);
	}}

//byte-int-
//char-int