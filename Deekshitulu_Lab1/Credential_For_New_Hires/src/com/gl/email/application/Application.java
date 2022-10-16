package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;

import com.gl.email.service.CredentialService;

public class Application {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		Employee emp = new Employee("shruti", "jain");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		String generatedPassword;
		
		
		System.out.println("Please enter the following details ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1: {
		    generatedEmail = cs.generatedEmailAddress(emp.getFirstName(),emp.getLastName(),"techical");
		    generatedPassword = cs.generatePassword();
		    cs.showCredentials(emp, generatedEmail, generatedPassword);
		        break;
		}
		        
		case 2:{
			generatedEmail = cs.generatedEmailAddress(emp.getFirstName(),emp.getLastName(),"admin");
		    generatedPassword = cs.generatePassword();
		    cs.showCredentials(emp, generatedEmail, generatedPassword);
		        break;
				
		}
		
		case 3:{
			generatedEmail = cs.generatedEmailAddress(emp.getFirstName(),emp.getLastName(),"HR");
		    generatedPassword = cs.generatePassword();
		    cs.showCredentials(emp, generatedEmail, generatedPassword);
		        break;
		}
		
		case 4:{
			generatedEmail = cs.generatedEmailAddress(emp.getFirstName(),emp.getLastName(),"legal");
		    generatedPassword = cs.generatePassword();
		    cs.showCredentials(emp, generatedEmail, generatedPassword);
		        break;
		}
		
		
		
		
		
	}

	}
}
