package com.song.demo;

/**
 * 单例(懒汉)
 * @author 宋伟宁
 * 2016年2月29日上午9:57:02
 */
public class SingleTone{
    //1：私有的构造
	private SingleTone() {}
	//2:私有的本身属性
	private static SingleTone st;
	//3：公共的静态的创建对象的方法
	public static synchronized SingleTone getInstance(){
	   if(st==null) st= new SingleTone();
	   return st;
	}
}
