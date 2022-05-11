package com.hackerrank.warmup;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DrawingBook {
	
	
	private static int mainDrawingBook(int n, int p) 
	{
		int front=frontBook(n,p);
		int back=backBook(n, p);
		
		int ans=(front<=back)?front:back;
		
		return ans;
	}
	
	private static int frontBook(int n, int p)
	{
		int finalResult=0;
		Map<Integer, Integer> map=new LinkedHashMap<Integer,Integer>();
		
		int count=0;
		int i=1;
		for( i=1; i<=n; i++)
		{
			
			if(i==1)
			{
				count++;
			}
			else if((i%2==0 && i+1%2!=0))
			{
				count++;
			}

			if(i==p)
			{
				break;
			}
			map.put(i, count);
		}
			
			
			// Iterating the map through for each loop
			int c=1;
						
			for(Map.Entry<Integer, Integer> lhm:map.entrySet())
			{
				if(c==map.size())
				{
					finalResult=lhm.getValue();
								
				}
						}
						c++;
		
		// Iterating the map
		
		
		return finalResult;
	}
	
	private static int backBook(int n, int p)
	{
		int i=1;
		int finalResult=0;
		Map<Integer, Integer> map=new LinkedHashMap<Integer,Integer>();
		int ans=0;
		int count=0;
		for( i=n; i>=1; i--)
		{
			if(i==1)
			{
				count++;
			}
			else if((i%2==0 && i+1%2!=0))
			{
				count++;
			}

			if(i==p)

			{
				break;
			}
		}
			map.put(i, count);
			
			// Iterating the map through for each loop
			int c=1;
			
			for(Map.Entry<Integer, Integer> lhm:map.entrySet())
			{
				if(c==map.size())
				{
					finalResult=lhm.getValue();
					
				}
			}
			c++;
			
		return finalResult;
		

	}


	// Main Method
	public static void main(String[] args) {
		int n=6, p=2;
		
		int result=mainDrawingBook(n,p);
		System.out.println(result);
		
	}
	
}
