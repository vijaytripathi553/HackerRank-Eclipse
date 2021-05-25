package com.hackerrank.practice;

import java.util.Scanner;

public class JavaLoop2 {
	
	public void find()
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		for(int i=1; i<=q; i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			// Formula 
			// (a+2^0*b),(a+2^0*b+2^1*b)......
			int temp=a;
			for(int j=0; j<n; j++)
			{
				temp=(int) (temp+(Math.pow(2, j)*b));
				System.out.print(temp+" ,");
			}
			System.out.println();
			
			
		}
				
	}
	public static void main(String args[])
	{
		JavaLoop2 jl=new JavaLoop2();
		jl.find();
		
	
	}

}
