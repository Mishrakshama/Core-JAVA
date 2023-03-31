package Exception;

class InvalidNameException extends Exception {
    public InvalidNameException(String message)
    {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message)
    {
        super(message);
    }
}
class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message)
    {
        super(message);
    }
}
public class Validator {
	public boolean validateName(String name){
		if(name==null||name.trim().isEmpty())return false;
		else return true;
	}
	public boolean validateJobProfile(String jobProfile) {
		if((jobProfile.equalsIgnoreCase("Associate"))||(jobProfile.equalsIgnoreCase("Clerk"))||(jobProfile.equalsIgnoreCase("Executive"))||(jobProfile.equalsIgnoreCase("Officer")))return true;
		else return false;
	}
	public boolean validateAge(int age){
		if(age>=18 && age<=30)return true;
		else return false;
	}
	
	public void validate(Applicant applicant) throws InvalidNameException,InvalidAgeException,InvalidJobProfileException{
		if(!validateName(applicant.getName())) {
			throw new InvalidNameException("Invalid name");
		}
		if(!validateAge(applicant.getAge())) {
			throw new InvalidAgeException("Invalid age");
		}
		if(!validateJobProfile(applicant.getJobProfile())) {
			throw new InvalidJobProfileException("Invalid job profile");
		}
	}
 }

