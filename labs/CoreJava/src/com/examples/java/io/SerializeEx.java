package com.examples.java.io;


	import java.io.*;

	public class SerializeEx {

		public static void main(String[] args) {
			Student e = new Student();
			e.name = "Reyan Ali";
			e.address = "Phokka Kuan, Ambehta Peer";
			e.uid = 11122333;
			e.id = 101;

			try {
				FileOutputStream fileOut = new FileOutputStream("D:\\files\\employee.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(e);
				out.close();
				fileOut.close();
				System.out.printf("Serialized data is saved in D:\\files\\employee.txt");
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
	}
	


