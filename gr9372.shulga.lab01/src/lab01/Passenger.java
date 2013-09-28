package lab01;

public class Passenger implements Comparable<Passenger> {

	private String name;
	private String passportNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}



	@Override
	public int compareTo(Passenger object) {
		
		return this.name.compareTo(object.name);
	}

	

}
