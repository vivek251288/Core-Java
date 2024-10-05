package Pinnacle.thread;

public class Test extends Thread {
	public void run() {
		System.out.println("task1");
	}
	public static void main(String[] args) {
		Test thread1=new Test();
		thread1.start();
		Test thread2=new Test();
		thread2.start();
		
		Test thread3=new Test();
		thread3.start();
		
		Test thread4=new Test();
		thread4.start();
		
		Test thread5=new Test();
		thread5.start();
		
	}

}
