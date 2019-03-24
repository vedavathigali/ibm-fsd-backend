package core.examples.corejava;
import java.util.*;

public class prime {

public static void main(String args[]) {
	int n;
	int i=1,c=0;
	System.out.println("enter any number");
	Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	while(i<=n) {
		if(n%i==0) {
			c++;
		}
		i++;
	}
	if(c==2) {
		System.out.println(n+"is a prime number");
	}
	else {
		System.out.println(n+"is not a prime number");
		
	}

}
}
