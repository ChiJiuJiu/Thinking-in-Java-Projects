package edu.yctc.zyj.tij.p658;

import java.util.concurrent.Callable;

/**
 * Callable实现类
 * 
 * @author 15272
 *
 */
public class CallableImpl implements Callable<String> {

	/** 线程id */
	private int id;

	public CallableImpl(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of thread " + id;
	}

}
