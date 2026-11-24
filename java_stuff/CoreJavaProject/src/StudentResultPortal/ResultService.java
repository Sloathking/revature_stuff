package StudentResultPortal;

public class ResultService {
	
	// incident 1
	public void sendResult(String email) {
		if (email == null) {
			System.out.println("No email on file, result not sent.");
			return;
		}
		System.out.println("Result send to " + email.toLowerCase());
	}
	
	// incident 2
	public int classAverage(int totalMarks, int studentCount) {
		try {
			return totalMarks / studentCount;			
		}
		catch (ArithmeticException e) {
			System.out.println("No students in this class yet.");
			return 0;
		}
	}
	
	// incident 3
	public int readMarks(String input) {
		try {
			return Integer.parseInt(input);			
		}
		catch (NumberFormatException e) {
			System.out.println("Marks must be a number, got: " + input);
			return 0;
		}
	}
	
	// incident 4
	public String getSubject(int index) {
		try {
			String[] subjectStrings = { "Math", "Physics", "Chemisty" };
			return subjectStrings[index];			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return "Unknown Subject";
		}
	}
	
	// incident 5 and 6
	public void recordMarks(Student student, int marks) throws AttendanceShortageException {
		if (marks < 0 || marks > 100)
			throw new InvalidMarksException("Marks must be between 0 and 100, got: " + marks);
		if (student.attendance < 75)
			throw new AttendanceShortageException(student.name + " has " + student.attendance + "% attendance, minimum is 75%");
		student.marks = marks;
	}
}
