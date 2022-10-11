package com.threads.practice;

public class ThreadsExamples {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		mt1.start();
		mt2.start();
	}

}

class MyThread1 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("This is Thread_1 running...");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
			i++;
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("This is Thread_2 running...");
			i++;
		}
	}
}
