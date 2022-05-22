package com.hackerrank.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDistances 
{
	// Method which will return the minimum distance
	private static int minimumDistances(int[] array1)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<=array1.length; i++)	// 7,  1,  3,  4,  1,  7,  
		{
			
			for(int j=i+1; j<=array1.length-1; j++)
			{
				if(array1[j]==array1[i])
				{
					list.add(j-i);
					Collections.sort(list);
					
				}
			}
		}
		return list.get(0);
	}


	// Main method
	public static void main(String[] args)
	{
		
		/* int array1[]=new int[] {7,1,3,4,1,7}; */
		int array1[]=new int[] {7,1,3,4,1,7};
		int result=minimumDistances(array1);
		System.out.println(result);
		}
}
