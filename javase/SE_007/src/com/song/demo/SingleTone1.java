package com.song.demo;

/**
 * 单例(饿汉)
 * @author 宋伟宁
 * 2016年2月29日上午9:57:02
 */
public class SingleTone1{
    //1：私有的构造
	private SingleTone1() {}
	//2:私有的本身属性
	private static final SingleTone1 st=new SingleTone1();
	//3：公共的静态的创建对象的方法
	public static synchronized SingleTone1 getInstance(){
	   return st;
	}
}
