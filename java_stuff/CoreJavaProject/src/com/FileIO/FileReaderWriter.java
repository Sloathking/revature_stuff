package com.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("written.txt");
				FileReader reader = new FileReader("written.txt")) {
			
			writer.write("Hello!");
			writer.close();
			int i = reader.read();
			while (i != -1) {
				System.out.print((char)i);
				i = reader.read();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
