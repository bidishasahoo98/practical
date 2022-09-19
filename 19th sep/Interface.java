package operator;
//default and static method in interface
 interface Interface {
void print(); //abstract method(no need to declare method body)
default void show() {//default1
	System.out.println("hi");
}
static void hello() {//static method
	System.out.println("inside static method");
}
}
 class App implements Interface {
	public void print() {
		System.out.println("print");
	}
	public static void main(String[] args) {
		Interface ob=new App();
      ob.print();
      ob.show();
      Interface.hello();
      //calling static method using interface name
	}

}

