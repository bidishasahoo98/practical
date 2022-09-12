package operator;

public class Student_hasA {
int id;
String name;
Address_hasA Address;//aggregation or hasA relationship
public Student_hasA(int id,String name, Address_hasA Address) {
	this.id=id;
	this.name=name;
	this.Address=Address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(Address.city+" "+Address.state+" "+Address.country+" "+Address.area);
}
public static void main(String...args) {
	Address_hasA ad=new Address_hasA("Mdn","WB","India","Bidhannagar");
	Student_hasA sd=new Student_hasA(109, "Bidisha",ad);
	sd.show();
}
}
