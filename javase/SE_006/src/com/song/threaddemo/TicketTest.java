package com.song.threaddemo;

public class TicketTest {

	public static void main(String[] args) {
		TicketRunnable tr=new TicketRunnable();
		Thread t1=new Thread(tr);
		Thread t2=new Thread(tr);
		Thread t3=new Thread(tr);
//		Ticket t1=new Ticket();
//		Ticket t2=new Ticket();
//		Ticket t3=new Ticket();
//		Thread th1=new Thread(t1);
//		Thread th2=new Thread(t2);
//		Thread th3=new Thread(t3);
//		
//		th1.start();th3.start();th2.start();
//		Ticket ticket=new Ticket();
//		Thread t1=new Thread(ticket);
//		Thread t2=new Thread(ticket);
//		Thread t3=new Thread(ticket);
		t3.start();t1.start();t2.start();
		

	}

}
