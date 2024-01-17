package com.javaex.ex05;



	public class Ex01 {
		
	  public static void main(String[] args) {
			
			ThreadEx1_1 t1 = new ThreadEx1_1();
			
			Runnable r = new ThreadEx1_2();
			Thread t2 = new Thread(r); //생성자 Thread(Runnable target)
			
			t1.start();
			t2.start();
		
  }
		

}
