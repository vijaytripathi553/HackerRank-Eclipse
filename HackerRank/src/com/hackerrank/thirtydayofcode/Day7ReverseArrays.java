package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

public class Day7ReverseArrays {
	private static int[] reverseArray(int array1[])
	{
		for (int j = array1.length-1; j >=0; j--) {
			System.out.println(array1[j]);
			
		}
		return array1;
	}
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the size of an array:");
		int arrayLength=sc.nextInt();
		int array1[]=new int[arrayLength];
		System.out.println("Enetr"+" "+arrayLength+" "+"element:");
		// Outer for loop to insert the array element
		for (int i = 0; i < array1.length; i++) {
			array1[i]=sc.nextInt();
			//System.out.print(array1[i]+"");
			
		}
		
		Day7ReverseArrays.reverseArray(array1);
		
		

	}

}
