package core.examples.corejava;

import java.util.Scanner;

public class Evenodd {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+"is a even number");
			
		}
		else {
			System.out.println(n+"is odd number");
		}
	}

}
