package com.log2base2.array;

public class CatAndMouse{
	
	// Method to displacatB which cat will reach first to the Mouse positions
	private static String completeCatAndMouse(int catA, int catB, int mouseC)
	{
			int catACount=0;
	        int catBCount=0;
	        
	        
//    
	        if(catA<mouseC && catB>mouseC)
	        {
	            
	        for(int i=catA; i<=mouseC; i++)
	        {
	            catACount++;
	        }
	        
	        for(int j=catB; j>=mouseC; j--)
	        {
	            catBCount++;
	        }
	        
	        if(catACount<catBCount)
	        {
	            return "Cat A";
	        }
	        else if(catACount>catBCount)
	        {
	            return "Cat B";
	        }
	        else
	        {
	        	System.out.println("");
	            return "Mouse C";
	           
	        }
	        }
	        
	    
	        
	        else if(catA>mouseC && catB<mouseC)
	        {
	            
	        for(int i=catA; i>=mouseC; i--)
	        {
	            catACount++;
	        }
	        
	        for(int j=catB; j<=mouseC; j++)
	        {
	            catBCount++;
	        }
	        
	        if(catACount<catBCount)
	        {
	            return "Cat A";
	        }
	        else if(catACount>catBCount)
	        {
	            return "Cat B";
	        }
	        else
	        {
	            return "Mouse C";
	        }
	        }
	        
	        
	        
	        
	        
	        else
	        {
	        	if(catA<mouseC && catB<mouseC)
		        {
		            
		        for(int i=catA; i<=mouseC; i++)
		        {
		            catACount++;
		        }
		        
		        for(int j=catB; j<=mouseC; j++)
		        {
		            catBCount++;
		        }
		        
		        if(catACount<catBCount)
		        {
		        	System.out.println("😁");
		            return "Cat A 😁";
		        }
		        else if(catACount>catBCount)
		        {
		            return "Cat B 😁";
		        }
		        else
		        {
		            return "Mouse C 😁";
		        }
		        }
		        
	        }
	        
	        
			return null;
	    
	        
	}

	
// Main Method
	public static void main(String[] args) {
//		int catA=1, catB=2, mouseC=3;
		int catA=85, catB=66, mouseC=80;
		
		
		String result=completeCatAndMouse(catA,catB,mouseC);
		System.out.println(result);
	}

}


