package com.song.io.demo;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=500;i++){
			System.out.print("子线程的名称是："+
		               Thread.currentThread().getName());
			System.out.println("子线程输出："+i);
		}
	}
}
