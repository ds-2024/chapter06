package com.javaex.ex05;

public class ThreadEx1_1 extends Thread{
	
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print(0);
		}
	}

}
