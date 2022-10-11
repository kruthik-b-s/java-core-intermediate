package com.training.phase2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream out = new FileOutputStream("MyFile.txt");
		ObjectOutputStream strOut = new ObjectOutputStream(out);
		SerializationClass sc = new SerializationClass();
		strOut.writeObject(sc);
		out.close();
		strOut.close();

		FileInputStream in = new FileInputStream("MyFile.txt");
		ObjectInputStream strIn = new ObjectInputStream(in);
		SerializationClass de = (SerializationClass) strIn.readObject();
		System.out.println(de.x + " " + de.y);
		in.close();
		strIn.close();

	}

}
