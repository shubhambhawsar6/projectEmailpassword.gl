package com.greatlearning.credential;
import com.greatlearning.employee.Employee;

import java.util.Random;

public class Credentialservice {
public char[] generatepassword() {
		
		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters =  "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String SpecialChar = "~!@#$%^&*+-/*.<>?";
		
		String value = CapitalLetters+SmallLetters+Numbers+SpecialChar;
		
		Random random=new Random();
	    
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			
			password[i]= value.charAt(random.nextInt(value.length())); 
		}
		return password;
	}
	
	public String generateEmailaddress(String firstName,String lastName,String Department) {
		return firstName+lastName+"@"+Department+"greatlearning.com";
	}
	
	public void showcredential(Employee employee,String generatedemail,char[] generatedpassword) {
		
		System.out.println("Dear "+employee.getFirstname()+" Your Generated credential are");
		System.out.println("Email.. >"+ generatedemail);
		System.out.println("password...>"+generatedpassword);
	}
}
