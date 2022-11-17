package student.service;

public class StudentNotFoundException extends ServiceException{
	public StudentNotFoundException(String message) {
		super(message);
	}
}
