package edu.yctc.zyj.tij.p656;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * p656 练习
 * 
 * @author 15272
 *
 */
public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("Thread Start");

		// 显示创建Thread
		for (int i = 0; i < 5; i++) {
			new Thread(new RunnableImpl()).start();
			System.out.println("Waiting for thread" + RunnableImpl.threadId);
		}

		// 利用执行器(Executor)创建
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new RunnableImpl());
		}
		executorService.shutdown();
	}
}
