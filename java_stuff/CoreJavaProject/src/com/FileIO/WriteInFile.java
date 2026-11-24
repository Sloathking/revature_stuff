package com.FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("test_file.txt");
			String output = "This is a test file that was written to by a FileOutputStream";
			fileOut.write(output.getBytes());
			System.out.println("Output written to file.");
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			fileOut.close();
			System.out.println("File closed");
		}
	}
}
