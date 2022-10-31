package operator;
/*
 //using Thread Class
public class ThreadCons {

	public static void main(String[] args) {
	Thread ob=new Thread("BIDISHA");
	//using the cons thread (String name)
	ob.start();//move to active state
	String str=ob.getName();
	//thread name by invoking gatName method
	System.out.println(str);
	}

}*/

//runnable interface

public class ThreadCons implements Runnable{
public void run() {
	System.out.println("Thread activated");
}
	public static void main(String[] args) {
		Runnable r= new ThreadCons();//creating obj of Thread cons class
	Thread ob=new Thread(r,"BIDISHA");
	//using the cons thread (String name)
	ob.start();//move to active state
	String str=ob.getName();
	//thread name by invoking gatName method
	System.out.println(str);
	}

}
