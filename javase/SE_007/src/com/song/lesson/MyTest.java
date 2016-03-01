package com.song.lesson;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyTest extends JFrame{

	private JButton btn;
	
	 public MyTest() {
		this.setSize(300, 300);//设置大小
		this.setVisible(true);//设置为可视
		this.setLocationRelativeTo(null);
		//创建按钮
		this.btn=new JButton("OK");
		//设置窗体的布局方式
		this.setLayout(new FlowLayout());
		//将按钮添加到窗体中
		this.add(this.btn);
		//为按钮注册事件
		this.btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//创建MyFrame的对象
				MyFrame mf= MyFrame.mf;
				
			}
		});
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		new MyTest();
	}
}
