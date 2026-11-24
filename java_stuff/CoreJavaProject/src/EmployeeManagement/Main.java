package EmployeeManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			Employee temp = new Employee(i, "Employee " + i, "Department" + i, i * 1200);
			employees.add(temp);
		}
		try ( FileOutputStream fileOutput = new FileOutputStream("EmployeeManagement.txt");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput)) {
			for (Employee e : employees) {
				objectOut.writeObject(e);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (FileInputStream fileInput = new FileInputStream("EmployeeManagement.txt");
				ObjectInputStream objInput = new ObjectInputStream(fileInput)) {
			Employee temp = (Employee)objInput.readObject();
			while (temp != null) {
				System.out.println(temp);
				temp = (Employee)objInput.readObject();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
