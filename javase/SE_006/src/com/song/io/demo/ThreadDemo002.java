package com.song.io.demo;

public class ThreadDemo002 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		HelloRunnable hr=new HelloRunnable();
		//创建第一个线程
		Thread th1=new Thread(hr);
		th1.setName("子线程1");//设置线程名称
		th1.start();
		//创建第二个线程
		Thread th2=new Thread(hr);
		th2.setName("子线程2");//设置线程名称
		th2.start();
		//创建第三个线程
		Thread th3=new Thread(hr);
		th3.setName("子线程3");//设置线程名称
		th3.start();

	}

}
