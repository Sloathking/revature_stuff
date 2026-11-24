package StudentResultPortal;

public class InvalidMarksException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public InvalidMarksException(String msg) {
		super(msg);
	}
}
