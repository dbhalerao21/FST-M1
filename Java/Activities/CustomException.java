package activities;

public class CustomException extends Exception {
	private String message =null;
	CustomException(String msg){
		
		System.out.println(msg);
	}
	@Override
	public String getMessage() {
	    return message;
	}
	

}
