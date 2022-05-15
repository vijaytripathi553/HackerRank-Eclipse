package com.hackerrank.warmup;

public class SaveThePrisoner1 {

	private static int savePrisioner(int n, int m, int s) 
	{
		// STEP 1 : Iterate over the loop  +	 In this loop we are iterating till the length of the Prisoner
		int ans=0;
		int i=0;
		for( i=s; i<=n; i++)
		{
			m--;     // Decrementing the candies one by one   4 6 2
			if(m==0)
			{
				return i;
			}
			else
			{
				System.out.println("In continue satement....");
				continue;
				
			}
			
		}
		if(m!=0)
		{
			
			 ans=letsCalculate(n, m, s);
			
		}

		return ans;
	}
	

	
	private static int letsCalculate(int n, int m, int s)
	{
		for(int i=1; i<=n; i++)
		{
			
			m--;
			
			if(m==0)
			{
				return i;
			}
			else  if(i==m && m!=0)
			{
				return letsCalculate(n, m, s);     //Recursion
			}
			else
			{
				continue;
			}
			
		}
		
		if(m!=0)
		{
			return letsCalculate(n, m, s) + letsCalculate(n, m, s);     //Recursion;     //Recursion 
		}
		return 0;
	}
	// MAin Method
	public static void main(String[] args) 
	{
		  
		//int n = 4; int m=6; int s=2; //   1st Test Case got Passed     Output =3
		int n = 4; int m=6; int s=2; //   1st Test Case got Passed     Output =3
		
		//int n = 7; int m=19; int s=2;  // 2nd test case got failed	 Output =6
		
		//int n = 3; int m=7; int s=3;//    3rd test case got Passed       Output =3
		  
		
		//int n = 5; int m=2; int s=1;  //  4th test case got passed     Output =2
		
		//int n = 5; int m=2; int s=2;  //    5th test case got passed   Output =3
		int result=savePrisioner(n,m,s);
		System.out.println(result);
	}
}
