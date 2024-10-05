package Pinnacle.thread;

import Pinnacle.Constractor.Main;

public class Threadop {
	
	
	public static void main(String[] args) {
		System.out.println("program started");
		int x=20+23;
		System.out.println("sum is...  " +x);
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current runing thread is " +tname);
		System.out.println("program ended...");
	}

}
