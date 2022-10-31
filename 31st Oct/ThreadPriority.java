package operator;

public class ThreadPriority extends Thread {
public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(800);
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}System.out.println(i);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ThreadPriority t1=new ThreadPriority();
	ThreadPriority t2=new ThreadPriority();
	ThreadPriority t3=new ThreadPriority();
t2.setPriority(MAX_PRIORITY);
System.out.println(t2.getPriority());//10
System.out.println(Thread.currentThread().getPriority());//by default set to 5 norm-priority
t1.start();
t2.start();
t3.start();
t1.setName("Tusi");
System.out.println(Thread.currentThread().getName());
}
}