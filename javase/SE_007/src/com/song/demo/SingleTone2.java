package com.song.demo;

/**
 * 单例
 * @author 宋伟宁
 * 2016年2月29日上午9:57:02
 */
public class SingleTone2{
    //1：私有的构造
	private SingleTone2() {}
	//2:公共的本身属性
	public static final SingleTone2 st=new SingleTone2();
	
}
