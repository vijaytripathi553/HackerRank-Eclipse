package com.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;

public class TimeInWords {
	
	public static String timeInWords(int h, int m)
    {
        
        Map<Integer,String> hours=new HashMap<Integer,String>();
        hours.put(1, "one");
        hours.put(2, "two");
        hours.put(3, "three");
        hours.put(4, "four");
        hours.put(5, "five");
        hours.put(6, "six");
        hours.put(7, "seven");
        hours.put(8, "eight");
        hours.put(9, "nine");
        hours.put(10, "ten");
        hours.put(11, "eleven");
        hours.put(12, "twelve");
        
        Map<Integer,String> minutes=new HashMap<Integer,String>();
        minutes.put(00, "o' clock");
        minutes.put(1, "one");
        minutes.put(2, "two");
        minutes.put(3, "three");
        minutes.put(4, "four");
        minutes.put(5, "five");
        minutes.put(6, "six");
        minutes.put(7, "seven");
        minutes.put(8, "eight");
        minutes.put(9, "nine");
        minutes.put(10, "ten");
        minutes.put(11, "eleven");
        minutes.put(12, "twelve");
        minutes.put(13, "thirteen");
        minutes.put(14, "fourteen");
        minutes.put(15, "quarter past");
        minutes.put(16, "sixteen");
        minutes.put(17, "seventeen");
        minutes.put(18, "eighteen");
        minutes.put(19, "nineteen");
        minutes.put(20, "twenty");
        minutes.put(21, "twenty one");
        minutes.put(22, "twenty two");
        minutes.put(23, "twenty three");
        minutes.put(24, "twenty four");
        minutes.put(25, "twenty five");
        minutes.put(26, "twenty six");
        minutes.put(27, "twenty seven");
        minutes.put(28, "twenty eight");
        minutes.put(29, "twenty nine");
        
        
        
        // STEP 1: Let's read the hours
        String hoursRead="";
        if(hours.containsKey(h)) 
        {
             hoursRead=hours.get(h);
            //System.out.print(hoursRead+" ");
            
        }
        
        // STEP 2: Let's read the minutes
        
        if(minutes.containsKey(m) && m==00 )
        {
            String testCase1=minutes.get(m);
            return hoursRead+" "+testCase1;
            //System.out.println(hoursRead+" "+testCase1);
        }
        else if(minutes.containsKey(m) && m==15 )
        {
            String testCase2=minutes.get(m)+" "+hoursRead;
            //System.out.println(testCase2);
            return testCase2;
            
        }
        else if(minutes.containsKey(m) && m<30)
        {
            if(m==1)
            {
                  String test=minutes.get(m)+" "+"minute past"+" "+hoursRead;
                  return test;
          
            }
            String testCase3=minutes.get(m)+" "+"minutes past"+" "+hoursRead;
           // System.out.println(testCase3);
            return testCase3;
        }
        
        else if( m==30)
        {
            //String testCase4=minutes.get(m)+" "+""+" "+hoursRead;
            return "half past"+" "+hoursRead;
           //System.out.println("half past"+" "+hoursRead);
            
        }

        else if( m==45 && hours.containsKey(h))
        {
            //String testCase4=minutes.get(m)+" "+""+" "+hoursRead;
            String ans=hours.get(h+1);
            return "quarter to"+" "+ans;
            //System.out.println("quarter to"+" "+hoursRead);
            
        }
        

        else if( m>30 && m<60 )
        {
            int diff=60-m;
            
            if(minutes.containsKey(diff) && hours.containsKey(h+1))
            {
                String hh=hours.get(h+1);
                String testCase5=minutes.get(diff)+" "+"minutes to"+" "+hh;
               
                return  testCase5;
                //System.out.println(testCase5);
            }
            
            
        }
        else
        {
            return "Either hours or minutes is out of range";
        }
        
                return null;
    }
	
	// Main Method
	public static void main(String[] args) {
		
		int h=5;
		int m=45;
		
		String result=timeInWords(h,m);
		System.out.println(result);
		
	}

	

	
}
