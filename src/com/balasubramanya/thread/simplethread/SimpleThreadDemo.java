/**
 * @author Balasubramanya S
 */
package com.balasubramanya.thread.simplethread;

public class SimpleThreadDemo {

	public static void main(String[] args) {
		RunnableSimpleThread runnableSimpleThread = new RunnableSimpleThread();
		new Thread(runnableSimpleThread).start();
		
		SimpleThread simpleThread = new SimpleThread();
		simpleThread.start();

	}

}
