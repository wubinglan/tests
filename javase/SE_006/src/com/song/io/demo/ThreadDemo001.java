package com.song.io.demo;

public class ThreadDemo001 {
    //演示多线程
	public static void main(String[] args) {
		 //创建线程
		 MyThread mt=new MyThread();
		 //mt.run();//错误：方法调用
		 Thread th=new Thread(mt);
		 th.start();//启动线程
		 //main方法就是一个（主）线程
		 for(char i='a';i<='z';i++){
			 System.out.println("主线程："+
		      Thread.currentThread().getName()+
					            "输出"+i);
		 }
		
		 
		 
          
	}

}
