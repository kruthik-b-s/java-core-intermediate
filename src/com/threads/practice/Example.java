package com.threads.practice;

public class Example implements Runnable {

	int count;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count();
		}
	}

	synchronized void count() {
		count++;
	}

}
