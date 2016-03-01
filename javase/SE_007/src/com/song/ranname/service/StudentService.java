package com.song.ranname.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;

import com.song.ranname.domain.Student;

public class StudentService implements IStudentService {

	@Override
	public void input(Student stu) {
		//添加
		STUDENTS.add(stu);
	}

	@Override
	public String getNameByRan() {
		if (STUDENTS.size() > 0) {
			int m = new Random().nextInt(STUDENTS.size());
			return STUDENTS.get(m).getName();
		}
		return null;
	}

	@Override
	public void save() throws Exception {
		// 序列化
		if(STUDENTS.size()>0){
			ObjectOutputStream out=
					new ObjectOutputStream(new FileOutputStream("stus.ser"));
			out.writeObject(STUDENTS);
			out.close();
		}
	}

	@Override
	public void load() throws Exception {
		// 反序列化
		File file=new File("stus.ser");
		if(file.exists()){
			ObjectInputStream in=
					new ObjectInputStream(new FileInputStream(file));
			STUDENTS.addAll( (List<Student>)in.readObject());
			in.close();
		}
	}

}
