package com.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObj {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Test Name", 1000);
		try (FileOutputStream output = new FileOutputStream("obj_file.txt");
				ObjectOutputStream objOutput = new ObjectOutputStream(output);
				FileInputStream input = new FileInputStream("obj_file.txt");
				ObjectInputStream objInput = new ObjectInputStream(input)) {
			System.out.println(e1);
			objOutput.writeObject(e1);
			
			e1 = (Employee)objInput.readObject();
			System.out.println(e1);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
