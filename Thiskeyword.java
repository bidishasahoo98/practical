package operator;

public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	//constructor
	Thiskeyword(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		}
		//method
		void display() {
			System.out.println(rollno+" "+name+" "+fee);
		}
		public class Test { //class2
		public static void main(String[] args) {
			// Staticvariable1.change();
			//objects
			Thiskeyword s1= new Thiskeyword(109,"Bidi",42000);
			Thiskeyword s2= new Thiskeyword(108,"ABC",42500);
			 s1.display();
			 s2.display();
		}

	}}
	