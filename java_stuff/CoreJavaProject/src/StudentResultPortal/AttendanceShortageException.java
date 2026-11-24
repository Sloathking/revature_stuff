package StudentResultPortal;

public class AttendanceShortageException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AttendanceShortageException(String msg) {
		super(msg);
	}
}
