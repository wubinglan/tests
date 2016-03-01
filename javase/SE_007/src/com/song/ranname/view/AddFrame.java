package com.song.ranname.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.song.ranname.domain.Student;
import com.song.ranname.service.IStudentService;
import com.song.ranname.service.StudentService;

public class AddFrame extends JFrame{
	 private JButton btnAdd;//按钮
	 private JTextField txtName;//文本框
	 private IStudentService service=new StudentService();
	 
     private AddFrame() {//私有的默认构造
		this.setTitle("添加学生");
		this.setSize(280,100);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建控件对象
		this.txtName=new JTextField(10);
		this.btnAdd=new JButton("录入");
		//设置布局方式
		this.setLayout(new FlowLayout());
		this.add(this.txtName);
		this.add(this.btnAdd);
		this.setResizable(false);//禁止改变大小
		this.btnAdd.addActionListener(new MyButton());
	}
     
     private class MyButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//添加到集合中
			/**
			 * 1：获取文本框的值（判断为空）
			 * 2：创建学生对象
			 * 3：封装姓名属性
			 * 4：添加到集合中
			 */
			String name= txtName.getText();//获取文本框的值（判断为空）
//			if(name==null)
//			if(name.length()==0)
//			if(name.equals(""))
			if(name.isEmpty()){
		       JOptionPane.showMessageDialog(null, "姓名不能为空");	
			}else{
				Student stu=new Student(name);
				service.input(stu);
				JOptionPane.showMessageDialog(null, "添加成功，当前有"+
				               IStudentService.STUDENTS.size()+"个学生");
				txtName.setText("");
				
			}
				
			
		}
    	 
     }
     
     public static void main(String[] args) {
		 AddFrame add=AddFrame.ADD_FRAME;
	}
    public static final AddFrame ADD_FRAME= new AddFrame();
    
    
}
