package Entities;

public class Customer {
	
	int id;
	String firstName;
	String lastName;
	String nationalityId;
	int birthDatetime;
	
	public Customer(int id, String firstName, String lastName, String nationalityId, int birthDatetime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthDatetime = birthDatetime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getBirthDatetime() {
		return birthDatetime;
	}
	public void setBirthDatetime(int birthDatetime) {
		this.birthDatetime = birthDatetime;
	}
	
}
