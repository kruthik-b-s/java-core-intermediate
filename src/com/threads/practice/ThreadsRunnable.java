package com.threads.practice;

public class ThreadsRunnable {

	public static void main(String[] args) {
		RunnableThread1 rt1 = new RunnableThread1();
		Thread t1 = new Thread(rt1);
		RunnableThread2 rt2 = new RunnableThread2();
		Thread t2 = new Thread(rt2);
		t1.start();
		t2.start();

//		MyThread mt = new MyThread(rt1, "Kruthik");
//		mt.start();
//		System.out.println(mt.getId() + " " + mt.getName());
	}

}

class MyThread extends Thread {
	public MyThread(Runnable r, String name) {
		super(r, name);
	}

	@Override
	public void run() {
		System.out.println("This is MyThread run() method...");
	}
}

class RunnableThread1 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("This is Thread_1 running...");
			i++;
		}
	}
}

class RunnableThread2 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("This is Thread_2 running...");
			i++;
		}
	}
}