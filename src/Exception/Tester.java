package Exception;

public class Tester {

	public static void main(String[] args) {
		  try {
	            Applicant applicant= new Applicant();
	            applicant.setName("Jenny");
	            applicant.setJobProfile("Assistent");
	            applicant.setAge(25);
	            
	            Validator validator = new Validator();
	                  
	            validator.validate(applicant);
	            System.out.println("Application submitted successfully!");
	        } 
	        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
