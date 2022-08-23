package operator;

public class Vowelswitch {

	public static void main(String[] args) {
		char ch='e';
		switch(ch) //switch expression
		{ //case statement
		case 'y' : System.out.println("it is not vowel");
		break;
		case 'g' : System.out.println("it is not vowel");
		break;
		case 'o' : System.out.println("it is vowel");
		break;
		case 'e' : System.out.println("it is also vowel");
		break;
		default: System.out.println("it is consonant");//default case statement
		}}}
