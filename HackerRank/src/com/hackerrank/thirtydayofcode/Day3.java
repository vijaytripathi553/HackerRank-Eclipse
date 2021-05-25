package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

public class Day3 {
	private static void conquerConditional(int N)
	{
		if(N%2!=0 && N%2==0 && N==6 || N==7|| N==8||N==9||N==10||N==11||N==12||N==13||N==14||N==15||N==16||N==17||N==18||N==19||N==20)
	        System.out.println("Weird");
	        else
	        {
	            if((N%2==0 && N==2||N==3||N==4||N==5) || (N%2==0 && N>20))
	            System.out.println("Not Weird");
	        }
		
	}
// Main Method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Day3.conquerConditional(N);
		
	}
}
