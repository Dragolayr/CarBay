package com.servlet;

public class Recipients {
	private String firstName;
	private String lastName;
	private String email;


	
	public Recipients() {
		
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return  firstName +", "+ lastName +", "+ email + " newnew\n";
	}
	
	
	



}
