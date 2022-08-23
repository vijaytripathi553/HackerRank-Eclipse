package com.hackerrank.warmup;
import java.util.*;
public class AlternatingCharacters
{
	// Method which is responsible to display the alternate characters
	private static int alternatingCharacters(String str) 
	{
		int count=0;
		// STEP 1: Converting the given String into an array
		String strArray[]=str.split("");
		
		for (int i = 0; i < strArray.length; i++)
		{
			for(int j=i+1; j < strArray.length; j++)
			{
				if(strArray[i].equalsIgnoreCase(strArray[j]))
				{
					count++;
				}
				
				
				break;
				
			}
			
		}
		
		return count;
	}
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many test cases you want to test:");
		int n=sc.nextInt();
		
		String str="";
		for(int i = 0; i<n; i++)
		{
			str=sc.next();
			
			int result=alternatingCharacters(str);
			System.out.println(result);
		}
		
		
		
	}

	
}
