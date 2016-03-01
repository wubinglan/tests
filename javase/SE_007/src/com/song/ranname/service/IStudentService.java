package com.song.ranname.service;

import java.util.ArrayList;
import java.util.List;

import com.song.ranname.domain.Student;
//业务接口
public interface IStudentService {
	  List<Student> STUDENTS=new ArrayList<Student>(30);
	  
	  //录入：添加学生到集合中
	  void input(Student stu);
	  //点名：
	  String getNameByRan();
	  //序列化
	  void save() throws Exception;
	  //反序列化
	  void load() throws Exception;
	  
	  
}
