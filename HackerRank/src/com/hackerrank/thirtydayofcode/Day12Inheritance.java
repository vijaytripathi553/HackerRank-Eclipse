package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

class Person12 {
	private String firstName;
	private String lastName;
	private int idNumber;

	// Person Constructor to initialise the data member of person class
	Person12(String firstName, String lastName, int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	// To print FirstName, LastName and Id of the Person

	public void printPerson12() {
		System.out.println("Name: " + lastName + " ," + firstName + "\nId: " + idNumber);
	}
}


public class Day12Inheritance {
	// Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name:");
		String firstName = sc.next();

		System.out.println("Enter Last Name:");
		String lastName = sc.next();

		System.out.println("Enter Id:");
		int id = sc.nextInt();

		System.out.println("How many no you are going to enter to calculate the length:");
		int totalNo = sc.nextInt();

		int totalNoInArray[] = new int[totalNo];

		for (int i = 0; i < totalNoInArray.length; i++) {
			totalNoInArray[i] = sc.nextInt();
			

		}
		// Creating an object of student class
		Student s = new Student(firstName, lastName, id, totalNoInArray);

		s.printPerson12();
		System.out.println("Grade is:" + s.calculate());

	}

}
