package com.hackerrank.warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistanceApproach2 
{
	//TODO
	//1.) get() & 2.) getDefault()
	private static int minimumDistances(int[] a)
	{
		Map<Integer, Integer> map=new HashMap<>();    // In a key we are storing the array element and in value part we are storing the indices of array element
		// 1st Let's go with the size of an array
		int currentIndex=0;
		int prevIndex=0;
		int minDistance=Integer.MAX_VALUE;
		for (int i = 0; i <a.length; i++) 
		{
			if(map.containsKey(a[i]))
			{
				// Initially map does contain any element as it is empty
				currentIndex=i;		// If element is present in map then in current index we store its index i.e at which index that elemnt is present
				prevIndex=map.get(a[i]);			// Since we are passing value to the get methos it will return you its key. so, basically prevIndex=map.get(a[i]); will return you the index of element which already present in the map.
				
				int  diff=currentIndex-prevIndex;
				minDistance=Math.min(diff, minDistance); // Math.min() function takes 2 arguments and returns the smaller of two int values.
			}
			else
			{
				map.put(a[i], i);
			}
			
			
		}
		return (minDistance==Integer.MAX_VALUE)?-1:minDistance;
	}

	// Main Method
	public static void main(String[] args)
	{
//		int a[]=new int[] {7,  1,  3,  4,  1,  7};
		int a[]=new int[] {3,  2,  1,  2,  3};
		
		int result=minimumDistances(a);
		System.out.println(result);
		
		
	}


}
