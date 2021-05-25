package com.hackerrank.thirtydayofcode;

class Student extends Person12 {
	private int testScores[];

	// Student class constructor
	Student(String firstName, String lastName, int idNumber, int testScores[]) {
		// Calling or accessing the parent class data member
		// This is how we can access to parent class data member

		super(firstName, lastName, idNumber);
		this.testScores = testScores;

	}

	// Method to calculate the student Grade
	public char calculate() {

		int avg = 0;
		int sum = 0;
		for (int i = 0; i < testScores.length;i++) {
			sum = sum + testScores[i];

		}
		avg = sum / testScores.length;

		if (avg >= 90 && avg <= 100)
			return 'O';
		// System.out.println(ch1);
		else if (avg >= 80 && avg < 90)
			return 'E';
		// System.out.println(ch2);
		else if (avg >= 70 && avg < 80)
			return 'A';
		// System.out.println(ch3);
		else if (avg >= 55 && avg < 70)
			// System.out.println(ch4);
			return 'P';
		else if (avg >= 40 && avg < 55)
			// System.out.println(ch5);
			return 'D';
		else
			return 'T';

	}
}
