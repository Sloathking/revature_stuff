package com.FileIO;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try (FileInputStream fileInput = new FileInputStream("test_file.txt");
				BufferedInputStream buffInput = new BufferedInputStream(fileInput)) {
			while (buffInput.available() > 0) {
				System.out.print((char)buffInput.read());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
