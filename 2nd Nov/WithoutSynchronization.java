package operator;
//without using Synchronization
class MyThreadClass {
 //void print(int num) { //without sync
	 synchronized  void print(int num) { //with sync method
	  for(int i=1;i<=5;i++) {
		  System.out.println(num*i);
	  try {
		  Thread.sleep(500);
	  }catch(Exception e) {
		  System.out.println(e);
	  }}}}
class Thread1 extends Thread{
	MyThreadClass ws;
	Thread1(MyThreadClass ws) {
		this.ws=ws;
	}public void run() {
		ws.print(5);//5*1 5*2....5*5
	}} 
class Thread2 extends Thread{
	MyThreadClass ws;
	Thread2(MyThreadClass ws) {
		this.ws=ws;
	}public void run() {
		ws.print(500);//500*1 ....500*5
	}}
class WithoutSynchronization{
	public static void main(String[] args) {
		MyThreadClass ob=new MyThreadClass();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}