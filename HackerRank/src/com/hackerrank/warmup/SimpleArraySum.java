package com.hackerrank.warmup;

public class SimpleArraySum {
	private static int[] sumOfArray(int array1[])
	{
		int sum=0;
		for(int i=0; i<array1.length; i++)
		{
			sum=sum+array1[i];
			
		}
		System.out.println(sum);
		return array1;
		
	}
	
	
	//Main Method
	public static void main(String args[])
	{
		int array1[]= {10,20,30,40,50};
		SimpleArraySum.sumOfArray(array1);
		
		
	}

}
