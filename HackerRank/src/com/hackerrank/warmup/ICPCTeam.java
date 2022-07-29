package com.hackerrank.warmup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/*
**************************************************************************************************************************
//🟢🟢 This problem is taken from HackerRank . 
 *  Approach to solve this problem:
 *  - In this problem what is given is, 
 *  								No of teams
 *  							&   No of subjects 
 *  							Which each participants knows who are there at ACM ICPC event to paricipate.
 *  Here , subjects known by user is entered  in the form of 0-1 binary string.
 *  For instance,
 *               subject =4
 *         So, String str="0110";
 *         
**************************************************************************************************************************
*/
public class ICPCTeam {
	// Method to determine the time which is knowing maximum numbers of subject
	private static  List<Integer> acmTeam(String[] topics, int noOfTeam)
	{
		// STEP 1: Map 
		Map<Integer, String > map=new HashMap<Integer, String>();
		
		for (int i =0; i < noOfTeam; i++) 
		{
			map.put(i, topics[i]);
		}
		List<Integer> result=doCalculateCount(map);
		
		return result;
	}
	
	private static List<Integer> doCalculateCount(Map<Integer, String> map) 
	{
		 List<Integer> finalList=new ArrayList<Integer>();
		List<Integer> countList=new ArrayList<Integer>();
		int count=0;
		int max=0;
		int maxCount=0;
		
		for (int i = 0; i < map.size(); i++) // 0  1  2
		{
			for (int j = i+1; j < map.size(); j++)  // 1  2  
			{
				// Need to iterate the map
				String value1=map.get(i);  //{"10101","11110","00010"};
				String value2=map.get(j);
				String value1Array[]=value1.split("");
				String value2Array[]=value2.split("");
				
				int asResult=pleaseReturnTheCount(value1Array,value2Array);   //4
			
				 countList.add(asResult);
				  max=Collections.max(countList);
				 // Finding the count of max number in list
				  maxCount=0;
				 for(Integer myList:countList)
				 {
					 if(myList==max)
					 {
						 maxCount++;
					 }
					 else
					 {
						 continue;
					 }
						
				 }
				
				 
				 // Creating finalList to return the actual Result
		
				
			}
		}
		 finalList.add(max);
		 finalList.add(maxCount);
		return finalList;
	}
	
	
	// Method created on 28/07/2020
	private static Integer pleaseReturnTheCount(String value1Array[],String value2Array[])
	{
		int count=0;
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> countList=new ArrayList<Integer>();
		for(int i=0; i<value1Array.length; i++)
		{
			for(int j=i; j<value2Array.length; j++)
			{
				if(value1Array[i].equalsIgnoreCase("0") && value2Array[j].equalsIgnoreCase("0"))
				{
					list1.add(0);
				}
				else if(value1Array[i].equalsIgnoreCase("1")  && value2Array[j].equalsIgnoreCase("0"))
				{
					list1.add(1);
				}
				else if(value1Array[i].equalsIgnoreCase("0")  && value2Array[j].equalsIgnoreCase("1"))
				{
					list1.add(1);
				}
				else if(value1Array[i].equalsIgnoreCase("1")   && value2Array[j].equalsIgnoreCase("1"))  // if at both the places there is 1
				{
					list1.add(1);
				}
				break;
				
			}
			
		}
		
		
		// Logic to count no of 1's
		for (int k = 0; k < list1.size(); k++) {
			if(list1.get(k)==1)
			{
				count++;
			}
			
		}
		
		return count;
	}
	


	// Main Method
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner (System.in);
		
		/*
		 * System.out.println("How many teams are there:"); int noOfTeams=sc.nextInt();
		 * 
		 * System.out.println("How many subjects are there:"); int subject=sc.nextInt();
		 * 
		 * String array1[]=new String[noOfTeams]; for(int i=0; i<array1.length; i++) {
		 * System.out.println("Enter"+" "+i+"th "+"array element:"); // Before storing
		 * element into array let's check whether it has elements as exact as we have
		 * the String enter=sc.next(); // converting this strint into string array to
		 * determine the exactt count
		 * 
		 * String enterArray[]=enter.split(""); System.out.println(enterArray.length);
		 * 
		 * 
		 * if(enterArray.length>subject) {
		 * System.out.println("The subjects size entered by you is > then "); break; }
		 * else { array1[i]=enter; }
		 * 
		 * } System.out.println(Arrays.toString(array1));
		 */
		
	//	Integer noOfTeam=3;      									// Test Case 1: Tested and passed
	//	String topics[]=new String[] {"10101","11110","00010"};		// Test Case 2: Tested and passed
		
		Integer noOfTeam=4;  
		String topics[]=new String[] {"10101","11100","11010","00101"};	
		
		
		//Method Call
		List<Integer> result=acmTeam(topics, noOfTeam);
		System.out.println(result);
	}
}