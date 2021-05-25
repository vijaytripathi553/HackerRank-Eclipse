package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

public class Day5Loops {
	// Main Method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			int table=i*n;
			System.out.println(n+" "+"x"+" "+i+" "+"="+" "+table);
		}
		
		
		
	}

}
