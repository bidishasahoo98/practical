package operator;
/*
  //using Thread class
public class ThreadState extends Thread{
public void run() {
	System.out.println("Thread activated");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadState ob=new ThreadState();
		ob.start();
	}}*/
//using runnable interface
public class ThreadState implements Runnable{
	public void run() {
		System.out.println("Thread activated");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadState ob=new ThreadState();
		Thread t1=new Thread(ob);
		t1.start();
}}