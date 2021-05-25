package com.hackerrank.thirtydayofcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Day10DecimalToBinary {
	
	private static int ConvertDecimalToBinary(int decimal)
	{
		int count=1;
		List<Integer> list=new ArrayList<Integer>();
		while (decimal>0) {
			int rem=decimal%2;
			list.add(rem);
			decimal=decimal/2;
			//System.out.println(list);
		}
		//System.out.println("Reminder before reverse:");
		//System.out.println(list);
		
		//System.out.println("Reminder after reverse:");
		for (int i = list.size()-1; i >=0; i--) {
			
			//System.out.print(list.get(i)+" ");
			if(list.get(i)==1)
			{
				count++;	
					
			}
			else
			{
				break;
			}
			//System.out.println(count);
			
		}
		//System.out.println(count);
		
		return count;
	}
	//Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter decimal No :");
		int decimal=sc.nextInt();
		
		
		// function calling
	int c=Day10DecimalToBinary.ConvertDecimalToBinary(decimal);
	System.out.println(c);
		
		
		
		
		
		
		
	}

}
