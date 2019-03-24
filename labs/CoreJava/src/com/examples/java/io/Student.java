package com.examples.java.io;
public class Student implements java.io.Serializable{
public String name;
public String address;
public transient int uid;
public int id;
public void mailCheck() {
	System.out.println("mailing a check to "+name+" "+address);
}

}
