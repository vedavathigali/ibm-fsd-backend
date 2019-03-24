package com.examples.java.collections;


import java.util.*;

import com.examples.core.java.Employees1;
public class Collections {
	public static void main(String args[]) {
		
	
Vector countries=new Vector();
countries.add("india");
countries.add("usa");
countries.add("cannada");
countries.add("australia");

Iterator itr=countries.iterator();
while(itr.hasNext()) {
	Object item =itr.next();
	System.out.println(item);
	
}


//array length is increasing synamically
//for(int i=0;i<50;i++) {
	//countries.add("india"+i);
//}
System.out.println(countries.size());
for(Object item :countries) {
	System.out.println(item);
}
countries.remove(0);
System.out.println(countries.size());
for(Object item :countries) {
	System.out.println(item);
}


HashSet hash=new HashSet();
 
hash.add("india");
hash.add("usa");
hash.add("cannada");
hash.add("australia");
hash.add("australia");
hash.add("india");
hash.add("usa");
System.out.println(hash.size());
for(Object item :hash) {
	System.out.println(item);
}
HashSet  hset=new HashSet();
Employees1 emp1=new Employees1("vedavathi","0009E0",10000,"FSD");
Employees1 emp2=new Employees1("Divya","0009DB",5990,"FSD");
Employees1 emp3=new Employees1("bindhu","0009A0",8999,"sap");
Employees1 emp4=new Employees1("rohitha","0009DA",678,"ms");
hset.add(emp1);
hset.add(emp2);
hset.add(emp3);
hset.add(emp4);
for(Object emp:hset) {
	System.out.println(hset);

	}
Employees1 e=new Employees1("vedavathi","0009E0",10000,"FSD");
Employees1 e1=new Employees1("vedavathi","0009E0",10000,"FSD");
System.out.println(e.equals(e1));
}
	
}