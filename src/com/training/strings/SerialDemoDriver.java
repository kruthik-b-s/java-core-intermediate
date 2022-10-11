package com.training.strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialDemoDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		SerialDemo sd = new SerialDemo();
//		FileOutputStream fo = new FileOutputStream("myserial.txt");
//		ObjectOutputStream oo = new ObjectOutputStream(fo);
//		oo.writeObject(sd);
//		fo.close();
//		oo.close();

		FileInputStream fi = new FileInputStream("myserial.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		SerialDemo sd = (SerialDemo) oi.readObject();
		fi.close();
		oi.close();
		System.out.println(sd.name + " " + sd.id);
	}

}
