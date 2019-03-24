package com.examples.java.io;

import java.io.File;

public class FileEx {
	public static void main(String args[]) {
		File file=new File("D:\\files");
		System.out.println("Is directory:"+file.isDirectory());
		System.out.println("Absolute path:"+file.getAbsolutePath());
		System.out.println("path:"+file.getPath());
		System.out.println(file.lastModified());
		System.out.println();
		
		
		
		
	}

}
