package com.song.io.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo001 {

	public static void main(String[] args) {
		System.out.println(new Date());
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(new Date()));
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
		sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(new Date()));
		sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		System.out.println(sdf.format(new Date()));
//		System.out.println(2.0-1.1);
//		System.out.printf("%5.2f",2.0-1.1);
//		int f1=1,f2=1;
//		for(int i=1;i<20;i++){
//			System.out.printf("%-10d%-10d",f1,f2);
//			if(i % 2 == 0 ) System.out.println();
//			f1=f1+f2;
//			f2=f1+f2;
//		}
//		

	}

}
