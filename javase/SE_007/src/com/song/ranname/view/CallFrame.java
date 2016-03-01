package com.song.ranname.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.song.ranname.domain.Student;
import com.song.ranname.service.IStudentService;
import com.song.ranname.service.StudentService;
public class CallFrame extends JFrame implements Runnable{
	private IStudentService service=new StudentService();
	private JButton btnOK;
	private JTextField txtName;
	private Thread thread;
	private CallFrame() {
		this.btnOK=new JButton("开始");
		this.txtName=new JTextField(10);
		this.setSize(280, 100);
		this.setTitle("点名");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(this.txtName);
		this.add(this.btnOK);
		this.setResizable(false);//禁止改变大小
		this.btnOK.addActionListener(new MyAction());
	}
	
	private class MyAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//判断集合是否为空
			if(IStudentService.STUDENTS.isEmpty()){
				JOptionPane.showMessageDialog(null, "对比起，没有学生请先录入");
				AddFrame add=AddFrame.ADD_FRAME;
			}else{
			//一个按钮响应多个事件
			String mess=e.getActionCommand();
			if(mess.equals("开始")){
				if(thread==null){
			    thread=new Thread(CallFrame.this);
			    thread.start();//启动线程
				}else if(thread.isAlive()){
					thread.resume();//恢复
				}
			    //修改按钮的文本为暂停
			    btnOK.setText("暂停");
			}else if(thread.isAlive() && mess.equals("暂停")){
				
				thread.suspend();//挂起
				btnOK.setText("开始");
			}
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		CallFrame cf=CallFrame.CALL_FRAME;
	}
	public static final CallFrame CALL_FRAME=new CallFrame();
	@Override
	public void run() {
	   while(true){
		txtName.setText(service.getNameByRan());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}
	
}
