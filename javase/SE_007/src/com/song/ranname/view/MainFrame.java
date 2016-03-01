package com.song.ranname.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.song.ranname.service.IStudentService;
import com.song.ranname.service.StudentService;

public class MainFrame extends JFrame {
    private IStudentService service =new StudentService();
    private JMenuBar bar;//菜单条
    private JMenu menu;//菜单
    private JMenuItem itemAdd,itemName,itemExit;//菜单项
    
    {
    	//读取历史记录
    	try {
			this.service.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	private MainFrame() {
		this.bar=new JMenuBar();//实例化菜单条
		this.menu=new JMenu("系统");//实例化菜单
		this.itemAdd=new JMenuItem("录入");//实例化菜单项
		this.itemName=new JMenuItem("点名");
		this.itemExit=new JMenuItem("退出");
		this.menu.add(itemAdd);
		this.menu.add(itemName);
		this.menu.add(itemExit);
		this.bar.add(this.menu);
		this.setJMenuBar(this.bar);
		
		this.setTitle("学生点名系统");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//为菜单项注册事件
		this.itemAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddFrame add=AddFrame.ADD_FRAME;
			}
		});
		this.itemName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CallFrame call=CallFrame.CALL_FRAME;
				
			}
		});
		
		this.itemExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//实现序列化
				try {
					service.save();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "谢谢，再见！");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MainFrame mf=MainFrame.MAIN_FRAME;
	}
	public static final MainFrame MAIN_FRAME=new MainFrame();
	
}
