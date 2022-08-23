package com.hackerrank.warmup;

/*
 *  This HackerRank problem is about the finding the minimum o=number of jumps required to findi
 * 
 * */
 



// Note : We are alowed to take either 1 ump or 2 jump at a time
public class JumpingOnTheClouds {
	
	// Method which is responsible to return the minnimum no of counts 
	private static int findMinimumNoOfJump(int[] cloudArray) 
	{
		int stepa1Count=-1;
		int step2Count=0;
		
		for(int i=0; i<cloudArray.length;)
		{
			if(i+2 < cloudArray.length && cloudArray[i+2]==0)
			{
				i=i+2;
			}
			else
			{
				i=i+1;
			}
			stepa1Count++;
		}
		return stepa1Count;
	}
	// Main Method
	public static void main(String[] args) {
		  int n=7; int cloudArray[]=new int[] {0,0,1,0,0,1,0};
		 
		/*
		 * int n=6; int cloudArray[]=new int[] {0,0,0,1,0,0};
		 */
		int actualCount=findMinimumNoOfJump(cloudArray);
		System.out.println(actualCount);
	}
}