package com.hackerrank.warmup;

// Addition of 2 No.

import java.util.Scanner;

public class SolveMeFirst {
	
	public int addition(int a, int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		SolveMeFirst sm=new SolveMeFirst();
		
		System.out.println(sm.addition(a, b));
		
		
	}

}
