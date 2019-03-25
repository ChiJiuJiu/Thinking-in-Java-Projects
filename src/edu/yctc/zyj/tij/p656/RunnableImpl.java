package edu.yctc.zyj.tij.p656;

/**
 * Runnable实现类
 * 
 * @author 15272
 *
 */
public class RunnableImpl implements Runnable {

	/** 线程id */
	public static int threadId = 0;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread" + threadId++ + "->runing");
		}
		Thread.yield();
	}

}
