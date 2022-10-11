package com.threads.practice;

public class ExampleMain {
	public static void main(String[] args) throws InterruptedException {
		Example e = new Example();

		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(e.count);

	}
}
