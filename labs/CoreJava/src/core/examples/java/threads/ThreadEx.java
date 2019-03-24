package core.examples.java.threads;

import java.util.Scanner;

public class ThreadEx {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Thread lifecyle Demo");
		//try {
			
			Thread.sleep(5000);
		//}//catch(InterruptedException e) {
			//System.out.println("error:"+e.getMessage());
			//e.printStackTrace();
		//}
		System.out.println("thread wokeup.......");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.nextLine());
		
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
