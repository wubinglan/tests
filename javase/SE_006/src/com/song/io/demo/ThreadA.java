package com.song.io.demo;

public class ThreadA extends Thread{
   private ShowInfo info;
   public ThreadA(ShowInfo info) {
	 this.info=info;
}
	@Override
	public void run() {
		
		try {
			this.info.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
