package com.song.lesson;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements KeyListener{

	private MyFrame() {
		this.setTitle("窗体1");
		this.setSize(300, 300);//设置大小
		this.setVisible(true);//设置为可视
		this.setLocationRelativeTo(null);//居中显示
	}
	public static final MyFrame mf=new MyFrame();
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
//	public static MyFrame getMyFrame(){
//		if(mf==null) mf=new MyFrame();
//		return mf;
//	}
	
	
	
	
	
	
	
	
}
 