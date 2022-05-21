package com.hackerrank.warmup;

import java.util.*;

public class StrangeCounter {
	
	private static long strangeCounter(long t) 
	{
		// STEP 1
		// Creating LinkedHashMap(Insertion order is preserved) to deal with the 1st cycle (time and associated value).
		Map<Integer,Integer> cycle1=new LinkedHashMap<Integer,Integer>();
		int keyCount=0;
		for(int i=100; i>=1; i--)
		{
			keyCount++;
			cycle1.put(keyCount, i);
		}
		
		//System.out.println("Cycle1"+cycle1);
		
		// STEP 2
		Map<Integer,Integer> cycle2=new LinkedHashMap<Integer,Integer>();
		
		//Logic to get the 1st element from map
		int key=0;
		for (int i =0 ; i < cycle1.size(); i++) 
		{
			if(i==0)
			{
				for(Map.Entry<Integer, Integer> map:cycle1.entrySet())
				{
					key=map.getValue();
					break;
				}
			}
			
		}
		//Logic to get 1st element from cycle1 ends here
		
		for (int i = key*2; i >=1; i--) 
		{
			keyCount++;
			cycle2.put(keyCount,i);
		}
		//System.out.println("Cycle2"+cycle2);
		
		
		
		//STEP 3:
		Map<Integer,Integer> cycle3=new LinkedHashMap<Integer,Integer>();
		//Logic to get the 1st element from map
				int key3=0;
				for (int i =1 ; i <= cycle2.size(); i++) 
				{
					if(i==1)
					{
						for(Map.Entry<Integer, Integer> map:cycle2.entrySet())
						{
							key3=map.getValue();
							break;
						}
					}
					
					
				}
				//Logic to get 1st element from cycle1 ends here
				
				for (int i = key3*2; i >=1; i--) 
				{
					keyCount++;
					cycle3.put(keyCount,i);
				}
			//	System.out.println("Cycle3"+cycle3);
				
		
		return returnAppropriateValue(cycle1,cycle2,cycle3,t);
	}
	
	// Method to return the exact value
	private static long returnAppropriateValue(Map<Integer,Integer>cycle1,Map<Integer,Integer>cycle2,Map<Integer,Integer>cycle3, long t)
	{
		int castingFromLongToInt= (int)t;
		if(cycle1.containsKey(castingFromLongToInt))
		{
			return cycle1.get(castingFromLongToInt);
		}
		else if(cycle2.containsKey(castingFromLongToInt))
		{
			return cycle2.get(castingFromLongToInt);
		}
		else
		{
			return cycle3.get(castingFromLongToInt);
		}
		
		
	}
	
	// Main Method
	public static void main(String[] args)
	{
		long t=22;
		long result=strangeCounter(t);
		System.out.println(result);
	}

	

}






