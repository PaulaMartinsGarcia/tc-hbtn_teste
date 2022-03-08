
import java.time.LocalDate;

public class Person {

	private String name;
	private String surname;
	private int birthDate;
	private boolean anotherCompanyOwner;
	private boolean Pensioner;
	private boolean PublicServer;
	private float salary;
	
	public Person() {
		
	}
	
	public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner,
			boolean publicServer) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.anotherCompanyOwner = anotherCompanyOwner;
		Pensioner = pensioner;
		PublicServer = publicServer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isAnotherCompanyOwner() {
		return anotherCompanyOwner;
	}

	public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
		this.anotherCompanyOwner = anotherCompanyOwner;
	}

	public boolean isPensioner() {
		return Pensioner;
	}

	public void setPensioner(boolean pensioner) {
		Pensioner = pensioner;
	}

	public boolean isPublicServer() {
		return PublicServer;
	}

	public void setPublicServer(boolean publicServer) {
		PublicServer = publicServer;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String fullName(){
	       return name + ' ' + surname;
	    }
	
	public float calculateYearlySalary() {
		return getSalary() * 12;
	}
	
	public boolean isMEI() {
		LocalDate current_date = LocalDate.now();
		
		return (getSalary() *12 < 130000) &&
				(current_date.getYear() - getBirthDate()>18) &&
				isAnotherCompanyOwner() == false &&
				isPensioner() == false &&
				isPublicServer() == false;
	}
}
