package com.examples.innerclasses;
import java.util.Scanner;
public class ValidateMain extends Validate {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee details");
	System.out.println("enter employee id");
	int id=sc.nextInt();
	System.out.println("enter employee Name");
	String name=sc.next();
	System.out.println("enter employee age");
	int age=sc.nextInt();
	boolean valstatus=validate(new ValidateEmployee() {public boolean check(int age) {return age>0;}},age);
	System.out.println(valstatus);
	if(!valstatus) {
		System.out.println("invalid");
	}
	System.out.println("enter employee salary");
	int salary=sc.nextInt();
	
	
}
}
