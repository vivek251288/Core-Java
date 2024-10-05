package Pinnacle.thread;

 public class MyThread1 extends Thread {
	public void run() {
		System.out.println("playing video");
	}
}
class MyThread2 extends Thread {
	public void run() {
			System.out.println("playing music");
		}
}
	class MyThread3 extends Thread {
		public void run() {
			System.out.println("progress bar is executing");
		}
	}
class MyThread4 extends Thread {
		public void run() {
			System.out.println("timer is executing");
}
}
 class TestThread {

	public static void main(String[] args) {
		
	
		MyThread1 Thread1 = new MyThread1();
		Thread1.start();
		MyThread2 Thread2= new MyThread2();
		Thread2.start();
		MyThread3 Thread3 = new MyThread3();
		Thread3.start();
		System.out.println("hello");
	}
	
}

