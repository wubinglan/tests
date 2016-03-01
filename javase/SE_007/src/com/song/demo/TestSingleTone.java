package com.song.demo;

public class TestSingleTone {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			System.out.println(SingleTone2.st.hashCode());
		}
//		SingleTone st1=SingleTone.getInstance();
//		SingleTone st2=SingleTone.getInstance();
//		SingleTone st3=SingleTone.getInstance();
//		
//		System.out.println(st1.hashCode());
//		System.out.println(st2.hashCode());
//		System.out.println(st3.hashCode());
//		System.out.println( st1 == st2);
		
	}

}
