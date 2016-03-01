package com.song.io.demo;

public class ThreadB extends Thread {
	private ShowInfo info;
	public ThreadB(ShowInfo info) {
		this.info = info;
	}
	@Override
	public void run() {
		try {
			this.info.show();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
