package com.hackerrank.thirtydayofcode;

import java.util.Scanner;

// Calculate the meal cost
public class Day2 {
	
	private static double calculateMealCost(double meal_cost,int tip_percent,int tax_percent)
	{
		
		double tippercent=tip_percent*meal_cost/100;  // Casting fro double to int
		double taxpercent=tax_percent*meal_cost/100;
		 meal_cost=Math.round(meal_cost+tippercent+taxpercent);
		return meal_cost;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double meal_cost=sc.nextDouble();
		int tax_percent=sc.nextInt();
		int tip_percent=sc.nextInt();
		
		double total=Day2.calculateMealCost(meal_cost, tip_percent, tax_percent);
		System.out.println(total);
		
		
	}

}
