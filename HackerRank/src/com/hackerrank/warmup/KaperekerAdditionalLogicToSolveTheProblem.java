package com.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaperekerAdditionalLogicToSolveTheProblem
{
	
	// Metho;d to solve the problem
	private static List<Integer> square(int startFrom, int n)
	{
		
			
		

		// In this list will keep adding the list of keperaker number and last will return it
		List<Integer> finalList=new ArrayList<>();
		
		if(n<100000 && n>0)
		{
		// Loop to display the list of kaperaker No from starting postion to ending position
		for(int i=startFrom; i<=n; i++)
		{
			
		
		
		int square=i*i; // 4941729
		System.out.println("Square is :"+square);
		
		int findTheCountOfDigitInN=0;
		
		
		String intToString=Integer.toString(i);
		
		int lngth=intToString.length();
		System.out.println("Finding the length of N through strings length function:"+lngth);
		
		String convertingSquareToInt=Integer.toString(square);
		System.out.println("Finding the length of square through strings length function:"+convertingSquareToInt.length());
		
		int check=lngth*2;
		
		
		
		String leftPart="";
		String rightPart="";
		if(convertingSquareToInt.length()==check)
		{
			// Left Part
			 leftPart=convertingSquareToInt.substring(0,intToString.length());
			System.out.println("Left Part :"+leftPart);
			
			// Right Part
			 rightPart=convertingSquareToInt.substring(intToString.length());
			System.out.println("Right Part :"+rightPart);
			
		}
		else
		{
			// Left Part
						 leftPart=convertingSquareToInt.substring(0,intToString.length()-1);
						System.out.println("Left Part :"+leftPart);
						
						// Right Part
						 rightPart=convertingSquareToInt.substring(intToString.length()-1);
						System.out.println("Right Part :"+rightPart);
						
		}
		
		
		// In case if left part or right part is empty then initialized it to 0
		if(leftPart.isEmpty())
			leftPart="0";
		
		if(rightPart.isEmpty())
			rightPart="0";
		
		
		
		
		// Converting leftPart and rightPart string to Integer foe calculating the addition
		int convertingLeftPartStringToInt=Integer.parseInt(leftPart);
		int convertingRightPartStringToInt=Integer.parseInt(rightPart);
		int totalSumOfLeftPartAndRightPart=convertingLeftPartStringToInt+convertingRightPartStringToInt;
		System.out.println("Total Sum Of Left Part And Right Part :"+totalSumOfLeftPartAndRightPart);
		if(totalSumOfLeftPartAndRightPart==i)
		{
			finalList.add(totalSumOfLeftPartAndRightPart);
			//System.out.println(totalSumOfLeftPartAndRightPart);
		}
		else
		{
			
			continue;
		}
		
		}
	} // If Closing
		
	
		
		return finalList;
	}
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=2223;
		//int n=45;
		//int n=9;
		//int n=297;
		//int n=2223; // Test Case 6 		Square : 49,41,729   		    	
		/*
		 * int n=1000; int startFrom=1;
		 */
		System.out.println("Enter starting range :");
		int startFrom=sc.nextInt();
		System.out.println("Enter last range :");
		int n=sc.nextInt();
		
		List<Integer> finalResult=square(startFrom,n);
		if(finalResult.isEmpty())
		{
			System.out.println("INVALID RANGE");
		}
		else
		{
			System.out.println(finalResult);
		}
		
	
	}
	
}