package com.song.demo;

import java.io.IOException;

public class Demo001 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//执行 处理
		Runtime run=Runtime.getRuntime();
		Process process=run.exec("notepad");
		Thread.sleep(2000);
	    process.destroy();
	}

}
