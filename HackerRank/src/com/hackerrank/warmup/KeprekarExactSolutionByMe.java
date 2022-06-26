package com.hackerrank.warmup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class KeprekarExactSolutionByMe {

	private static int myKeperakerNum(int n)
	{
		//STEP 1:	Let's find out the number of digit we have in the number
		//😀😀😀😀ROUGH WORK:
		//In order to count the exact digit first lets convert this number to String do that we can split it further
		//Converted an Integer to String
		String intToStringConversion=Integer.toString(n);
		//Then spliting the screen to get the current count
		
		String array1[]=intToStringConversion.split("");
		int digitCounter=0;
		for(int i=0; i<intToStringConversion.length(); i++)
		{
			digitCounter++;
		}
		
		
		// STEP 2: Now lets find out the squae of the number
		int square=n*n;
		System.out.println("✅ "+"Square of n : "+square);
		System.out.println("👍🏻");
		
	
		
		//STEP 3: After finding the square 
		//Converted an Integer to String
		String intToStringC=Integer.toString(square);
		//Then spliting the screen to get the current count

		String squareSpilit[]=intToStringC.split("");
		
		List<Integer> s1=new ArrayList<>();
		List<Integer> s2=new ArrayList<>();
		for(int i=0; i<squareSpilit.length; i++)
		{
			if(i<digitCounter)
			{
				s1.add(Integer.valueOf(squareSpilit[i])); // Since squareSpilit is type of String and we want to store in s1 list which is the type of integer. So, With the help of Integer.valueOf() method first we converted it to integer then we are storing it in the integer array
			}
			else
			{
				s2.add(Integer.valueOf(squareSpilit[i]));
			}
		}
		
		//Conversion from List to Array
		Integer a1[]=new Integer[digitCounter];
		a1=s1.toArray(a1);   // Converting list to array in a single line without iterating the loop 
		System.out.println("👍🏻 Congratulations...!!  You have successfully converted List of Integer to Array og Integer:");
		System.out.println("After conversion Array Elements are: "+Arrays.toString(a1));
		
		
		// Now Converting Array to String in order to remove , for addition
		String bcc=Arrays.toString(a1).replaceAll("\\D+","");
		System.out.println("Converted An Integer[] Array to String :"+bcc);
		System.out.println("👉 Now , Converting this String to Integer");
		Integer stringToInt1=Integer.valueOf(bcc);
		
		System.out.println("👉 Converted String to Integer:"+stringToInt1);
		System.out.println("Summery : This is how we convert an Integer Array to Integer");
		
		
		
		System.out.println("From S1 List:"+s1);
		System.out.println("From S2 List:"+s2);
		
		
		
		//STEP 4: Now lets convert the list s1 & s2 to array to add the list element
		Integer myArray1[]=new Integer[s1.size()];
		myArray1 =s1.toArray(myArray1);					// This is how we convert list to array
		Integer myArray2[]=new Integer[s2.size()]; 				// This is how we convert list to array
		myArray2 =s2.toArray(myArray2);		
		
		Integer myArray3[]=new Integer[myArray1.length];
		
		for(int i=0; i<myArray1.length; i++)
		{
			myArray3[i]=myArray1[i]+myArray2[i];
		}
		System.out.println("✅ myArray3 :"+Arrays.toString(myArray3));
 
				
		return 0;
	}
	
	// Main Method
	public static void main(String[] args) {
		int n=45;  //Test Case :1  		square :2025 					Y
		//int n=9;   //Test Case :2  		square :81  					Y
		//int n=297;   //Test Case :3  		square : 88,209  		        N
		
		//int n=703; // Test Case 4  		Square: 4,94,209			    Y
		//int n=999; // Test Case 5 		Square : 9,98,001   		    Y
		//int n=2223; // Test Case 6 		Square : 49,41,729   		    	N
		
		
		/*
		✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳
		NOTE :
		
	   - When square of the number is double in digit with respect to digit in n in that case test cases are getting passed.
	   - But if you will notice in Test Case No 3 and Test Case No 6 square is not double comparatively with the digit in n . So now, in order to pass these test cases we need to written additional logic , right ?
		
		
		LOGIC :
		✔ Will have to find the count of both the digit that is count of digit in 'n' and similarly the count of digit in 'square'.
		✔ If the square count is double as the count in 'n' then same logic need to be passed but if the square count is not double will hav to develop logic for that,
		And the logic is 
	    ✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳✳
		*/
		
		int result=myKeperakerNum(n);
	}


}
