package operator;

public class Nestedif {

	public static void main(String[] args) {
		String address="Kolkata,India";
		if(address.endsWith("India")) { //true
			if(address.contains("Dunlop")){ //true //false
			System.out.println("Your city is Dunlop");//X line 1 executed
		}else if(address.contains("Newtown")) { //false
			System.out.println("Your city is Newtown");//line 2 executed
		}else {
			System.out.println(address.split(" , ")[1]); //Kolkata,India
		} 
		}else{
			System.out.println("You are not living in India");}
		}
	}


