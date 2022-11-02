package operator;

public class DemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon thread");
		}
		else {
			System.out.println("normal thread");
			}
	}

	public static void main(String[] args) {
		 DemonThread dt1= new DemonThread();
		 DemonThread dt2= new DemonThread();
		 DemonThread dt3= new DemonThread();
		 dt1.setDaemon(true);
		 dt1.start();
		 dt2.start();
		 try {
		 dt2.setDaemon(true);//throws IllegalThreadStateException as after starting a thread we cant use setDaemon() method.
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 dt3.start();
	}}