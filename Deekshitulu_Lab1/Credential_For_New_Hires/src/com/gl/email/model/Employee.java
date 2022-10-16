package com.gl.email.model;

public class Employee {
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;
	
	public void Email(String firstName , String lastName){
			this.firstName = firstName ;
			this.lastName = lastName ;
					
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
	

}
