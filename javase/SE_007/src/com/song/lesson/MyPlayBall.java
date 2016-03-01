package com.song.lesson;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPlayBall extends JPanel implements Runnable{
	
	private int x;
	private int y=150;
	private int key;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getKey() {
		return key;
	}
	public void setKey( int key) {
		this.key = key;
	}
	public MyPlayBall() {
		this.setSize(400, 400);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 30, 30);	
	}
	public static void main(String[] args) {
		 Frame f=new Frame();
		 f.setSize(400, 400);
		 f.setVisible(true);
		 final MyPlayBall mp=new MyPlayBall();//创建面板
		 Thread th=new Thread(mp);//创建线程
		 th.start();//启动线程
		 f.add(mp);//将面板添加到容器中
		 f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				final int key=e.getKeyCode();
				mp.setKey(key);
				
			}
		});
	}
	@Override
	public void run() {
		while(true){
			switch (key) {
			case 37://左
				 this.x--;break;
			case 38://上
				 this.y--;break;
			case 39://右
                 this.x++;break;
			case 40://下
				 this.y++;break;
			}
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			 
		}
		
	}
	
}
