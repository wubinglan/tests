package com.song.io.demo;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getId());
			System.out.println(
			 Thread.currentThread().getName()+"++: "+i);
		}
		
	}

}
