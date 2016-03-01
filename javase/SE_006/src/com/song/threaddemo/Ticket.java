package com.song.threaddemo;

public class Ticket extends Thread{

	private int ticket=5;//默认有5张车票
	//（注意：ticekt是属性：成员变量：每个Ticket的对象都拥有它）
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			Thread thread=Thread.currentThread();
			if(ticket>0){
			System.out.println("售票点："+thread.getName()+
					            "卖出了第"+(--ticket)+"张牌");
			}
		}
	}
}
