package com.song.io.demo;

public class ShowInfo {

	public void show() throws InterruptedException{//show方法就是一个资源
		String mess="我是多线程的输出！";
		char[] arr=mess.toCharArray();
		//arr={'我','是','多','线','程','的','输','出','！'};
		for(char c: arr){
			System.out.println(c);
			Thread.sleep(500);
		}
	}
}
