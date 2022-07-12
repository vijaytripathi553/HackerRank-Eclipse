package com.hackerrank.warmup;

/*
***************************************************************************************************************************
✔✔ Logic Applied to solve this problem :
										-First, i have calculated the total gift cost (black & white ) without applying any conversion
										-Then i checked which gift cost price is lesser , After finding the lesser gift cost price i calculates the
										cost price of that gift. After that with the same lesser gift cost value i calculated the gift cost of its opposite gift.
	 🔲 Constraints
	           1<=t<=10 									   : Means test case t minimum value can be 1 and max value can be 10
	           0<=b,w,bc,wc,z <=10 to the power 9 (1000000000)  : Means b,w,bc,wc, and z  minimum value can be 0 and maximum value can 1000000000
	           									
	 🔲 NOTE : In the 1st attempt of submission out of 15 only 7 test cases were passed.
			 And after analysis i found that gift cost value should exceed 10 to the power 9 i.e.(1000000000)
	
***************************************************************************************************************************
*/
public class TaumAndBday {
	
	// Method to purchase both the gift in a minimum cost
	public static long taumBday(long b, long w, long bc, long wc, long z)
	{
		
		if(b<=1000000000 && w<=1000000000 && bc<=1000000000 && wc<=1000000000 && z<=1000000000)
		{
			
		
		long blackGiftCostByApplyingConversionRate=0;
		long whiteGiftCostByApplyingConversionRate=0;
		long total1=0;
		long total2=0;
		
		//STEP 1: LET'S CALCULATE THE GIFT COST FOR BOTH BLACK AND WHITE WITHOUT APPLYONG ANY CONVERSION
		// New idea :Let's convert with  and without conversion for both the product
		long blackGiftCost=b*bc;
		long whiteGiftCost=w*wc;
		long total=blackGiftCost+whiteGiftCost;   //42
		
		
		//STEP 2: With Conversion Rate Applied
		// a) First lets find the minimum value of gift cost
		long smartTernery=(bc<wc)?bc:wc;
		
		if(smartTernery==bc)
		{
			//Then first lets find black gift cost value
			blackGiftCostByApplyingConversionRate=b*bc;
			//Then
			whiteGiftCostByApplyingConversionRate=w*(bc+z);
			total1=blackGiftCostByApplyingConversionRate+whiteGiftCostByApplyingConversionRate;
		}
		else
		{
			// If white gift cost is less then
			whiteGiftCostByApplyingConversionRate=w*wc;
			blackGiftCostByApplyingConversionRate=b*(wc+z);
			total2=whiteGiftCostByApplyingConversionRate+blackGiftCostByApplyingConversionRate;
			
		}
		
		
		
		
		// Comparision
		if(smartTernery==bc)
		{
			
		
		if((total < total1  ) )
		{
			return total;
		}
		else
		{
			return total1;
		}
	
		}
		
		
		
		
		if(smartTernery==wc)
		{
			
		
		if((total < total2) )
		{
			return total;
		}
		else
		{
			return total2;
		}
	}
		
		}   // First If closing test case if closing
		
		return 0;
		
		
		
		
	}
	// Main Method
	public static void main(String[] args)
	{
	//	long b= 7,w=7,bc=4,wc=2,z=1;   ✔✔ PASSED
	//	long b= 3,w=3,bc=1,wc=9,z=2;   ✔✔ PASSED
	//	long b= 3,w=6,bc=9,wc=1,z=1;   ✔✔	PASSED 
	//	long b= 33588939,w=88855554,bc=843075,wc=218363,z=369538;  ✔✔ PASSED
		long b= 32767129,w=86759023,bc=948971,wc=397944,z=824814;
		
		long result=taumBday(b,w,bc,wc,z);
		System.out.println(result);
	}
}