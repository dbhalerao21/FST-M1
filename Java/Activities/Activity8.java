package activities;

class Activity8{
	public void exceptionTest(String msg) throws CustomException {
		throw new CustomException("this is new exception");
		
	}
	public static void main(String[] args) throws CustomException {
		Activity8 exc= new Activity8();
	
		try {
            // Method call with correct input
			exc.exceptionTest("Will print to console");
            // Method call with incorrect input
			exc.exceptionTest(null); // Exception is thrown here
			exc.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }

	}
	
	
}
