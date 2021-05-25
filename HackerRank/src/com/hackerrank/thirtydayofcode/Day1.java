package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

public class Day1 {
	
	public static void day2(int i,double d, String s)
	{
		// In Java we don't have sizeof operator which returns the sizemof data type but we can do so by dividing the bits of every data type by 8
		// Syntax
		//(datatype.size/8)
		 i=i+(Integer.SIZE/8);
		 d=d+(Double.SIZE/8);
		 String s1="HackerRank";
		  s=s1+" "+s;
		  System.out.println(i);
		  System.out.println(d);
		  System.out.println(s);
		
		
	}
	
	// Main Method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double d=sc.nextDouble();
		String s=sc.nextLine();
		
		Day1.day2(i, d, s);
		
		
		
	}

}
