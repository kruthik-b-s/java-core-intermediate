package com.training.strings;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("myfile.txt");
		fo.write(65);
		fo.write(66);
		fo.write(67);
		fo.close();
		System.out.println("Success");
	}
}
