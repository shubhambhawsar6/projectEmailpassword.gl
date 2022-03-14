package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.credential.Credentialservice;
import com.greatlearning.employee.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee=new Employee("Shubham","Bhawsar");
		Credentialservice cs=new Credentialservice();
		String generatedemail;
		char[] generatedpassword;
		
		System.out.println("Please Enter the department from tha following option");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1) {
			generatedemail=cs.generateEmailaddress(employee.getFirstname().toLowerCase(),
					employee.getLastname().toLowerCase(),"tech");
			generatedpassword=cs.generatepassword();
			cs.showcredential(employee, generatedemail, generatedpassword);
			}
		else if(option==2) {
				generatedemail=cs.generateEmailaddress(employee.getFirstname().toLowerCase(),
						employee.getLastname().toLowerCase(),"admin");
				generatedpassword=cs.generatepassword();
				cs.showcredential(employee, generatedemail, generatedpassword);
				}
		else if(option==3) {
					generatedemail=cs.generateEmailaddress(employee.getFirstname().toLowerCase(),
							employee.getLastname().toLowerCase(),"HR");
					generatedpassword=cs.generatepassword();
					cs.showcredential(employee, generatedemail, generatedpassword);
					}
		else if(option==4) {
						generatedemail=cs.generateEmailaddress(employee.getFirstname().toLowerCase(),
								employee.getLastname().toLowerCase(),"Legal");
						generatedpassword=cs.generatepassword();
						cs.showcredential(employee, generatedemail, generatedpassword);
						}
		else {
			System.out.println("Enter a valid option");
			sc.close();
		}
	}

}
