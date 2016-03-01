package com.song.io.demo;

public class TestShowInfo {

	public static void main(String[] args) {
		 ShowInfo showInfo=new ShowInfo();
		 
		 ThreadA ta=new ThreadA(showInfo);
		 ThreadB tb=new ThreadB(showInfo);
		
		 ta.start();
		 tb.start();
	}

}
