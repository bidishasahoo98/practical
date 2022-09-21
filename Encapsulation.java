package demo;
//fully encapsulated class
class Encapsulation {
private String name;
    public String getName() { //for get name
	return name;
}
     //for set the name
    public  void setName(String name) {
    	 this.name=name;
    	 System.out.println("name successfully updated");
     }
}
