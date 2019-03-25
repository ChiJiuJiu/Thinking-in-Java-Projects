package edu.yctc.zyj.p658;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<String>> list = new ArrayList<Future<String>>();
		for (int i = 0; i < 5; i++) {
			list.add(executorService.submit(new CallableImpl(i)));
		}
		for (Future<String> fs : list) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}
