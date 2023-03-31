package Static;

public class Participant {
private static int counter=100001;
private String registrationId="D";
private String name;
private long contactNumber;
private String city;

public Participant(String name, long contactNumber, String city) {
	this.name=name;
	this.contactNumber=contactNumber;
	this.city=city;
	
}
public static int getCounter() {
	return counter++;
}
public static void setCounter(int counter) {
	Participant.counter = counter;
}
public String getRegistrationId() {
	return registrationId+getCounter();
}

//public void setRegistrationId(String registrationId) {
//	this.registrationId = registrationId;
//}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getContactNumber() {
	return contactNumber;
}

public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
}
