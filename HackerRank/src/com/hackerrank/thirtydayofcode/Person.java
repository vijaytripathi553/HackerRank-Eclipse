package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

public class Person {
	//Instance variable
	int age;
	
	//Constructor
	Person(int initialAge)
	{
		age=initialAge;
		//Initialsing the constructor
		if(age<0)
		{
			System.out.println("Age is not valid. Setting Initial Age to zero");
			age=0;
		
		}
		
	}
	
	public void yearPasses()
	{
		age++;
	}
	
	public void amIOld()
	{
		if(age<13)
		{
			System.out.println("You are young");
		}
		else if(age>=13 && age<18)
		{
			System.out.println("You are teenager");
		}
		else
		{
			System.out.println("You are old");
		}
	}
	
	
	// Main Method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many test case are going to have");
		int totalTestCase=sc.nextInt();
		
		int listOfCase[]=new int[totalTestCase];
		
		for(int i=0; i<listOfCase.length;i++)
		{
			listOfCase[i]=sc.nextInt();
			//System.out.println("Here is list of test cases:"+listOfCase[i]);
			Person p=new Person(listOfCase[i]);
			p.amIOld();
			for(int j=0; j<3; j++)
			{
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		// Creating the object of Person class
		
		
		
	}
	

}
