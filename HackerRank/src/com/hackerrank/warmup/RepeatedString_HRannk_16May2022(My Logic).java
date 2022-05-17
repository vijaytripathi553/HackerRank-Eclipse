package com.hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedString_HRannk_16May2022 {

	private static int repeatedString(String a, int n) {
		// STEP 1: Converting an String to String Array
		String strArray[] = a.split("");
		List<String> arrayToList = Arrays.asList(strArray);
		List<String> arrayToList1 = new ArrayList<String>();
		arrayToList1.addAll(arrayToList);

		int diff = n - arrayToList1.size();
		for (int i = 0; i < diff; i++) {
			arrayToList1.add(arrayToList1.get(i));
		}
		System.out.println(arrayToList1);
		int countOfA = findRepeatedA(arrayToList1);
		return countOfA;
	}

	// STEP 2: This method is developed to determine the count of repeated character
	// 'a' in a given string
	private static int findRepeatedA(List<String> arrayToList1) {
		int count = 0;
		for (int i = 0; i < arrayToList1.size(); i++) {
			if (arrayToList1.get(i).equals("a")) {
				count++;
			} else {
				continue;
			}
		}

		return count;
	}

	// Main Method
	public static void main(String[] args) {

		
		  String a="abcac"; int n=10;
		  
		  int result = repeatedString(a, n);
		System.out.println(result);
	}
}