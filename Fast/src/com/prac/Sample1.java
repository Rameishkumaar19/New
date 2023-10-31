package com.prac;

import java.util.Scanner;

public class Sample1 {
	
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() <= 10 && phoneNumber.matches("\\d+");
    }
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a phone number: ");
	        String phoneNumber = scanner.nextLine();

	        if (isValidPhoneNumber(phoneNumber)) {
	            System.out.println("Valid number");
	        } else {
	            System.out.println("Invalid number");
	        }
	    }

	    
	





}
