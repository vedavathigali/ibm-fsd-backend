package core.examples.corejava;
import java.util.*;


public class swap {
	public static void main(String args[]) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		n1=sc.nextInt();
		System.out.println("enter 2nd number");
		n2=sc.nextInt();
		System.out.println("numbers before swapping is"+n1+"& "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("numbers after swapping is"+n1+" &"+n2);
		
		
		
	}

}
