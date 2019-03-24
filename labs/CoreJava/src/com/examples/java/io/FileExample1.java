package com.examples.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample1 {
	public static void main(String args[]) {
		FileInputStream in=null;
		FileOutputStream out=null;
		File source=new File("D:\\files\\input.txt");
		File target=new File("D:\\files\\output.txt");
		try {
			in=new FileInputStream(source);
			out=new FileOutputStream(target,true);//true is used to append 
			int c;
			while((c = in.read())!=-1) {
				System.out.println((char)c);
				out.write(c);
			}
			System.out.println("file copied succesfully");
		}
		catch(Exception e) {
			System.out.println("error occured-file not found"+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
