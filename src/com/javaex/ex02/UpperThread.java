package com.javaex.ex02;

public class UpperThread extends Thread {
	
	// 메소드
		public void run() {
			for(char ch='A'; ch<='Z'; ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

}
