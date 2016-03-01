package com.song.io.demo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exp001 {
	private static SimpleDateFormat sdf
	               =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	public static void printInfo(File file){
		 //判断是否是文件夹
		 if(file.isDirectory()){
			 File[] files=file.listFiles();//得到该目录下的所有目录和文件
			 for(File f: files){
				 if(f.isDirectory()){
					 System.out.println("文件夹的名称："+f.getName()
							            +"创建时间"+ sdf.format(new Date(f.lastModified())));
					 printInfo(f);//递归
				 }else{
					 System.out.println("\t文件的名称："+f.getName()
					            +"创建时间"+ sdf.format(new Date(f.lastModified())));
				 }
			 }
		 }
	}
	
	
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"demo");
        printInfo(file);
	}

}
