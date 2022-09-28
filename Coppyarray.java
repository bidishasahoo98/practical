package operator;

public class Coppyarray { //class

	public static void main(String[] args) {
		//declare source array
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		//declare a destination array
		char[]copyTo=new char[7];
		System.arraycopy(copyFrom, 1, copyTo, 0, 6);
		//print destination array
		System.out.println(String.valueOf(copyTo));
	}

}
