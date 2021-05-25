package com.hackerrank.thirtydayofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionaryAndMap {

	// Method to check whether key is present or not
	private static Map<String,Integer> CheckWhetherKeyIsAvailable(Map<String,Integer>map, Scanner sc)
	{
		System.out.println("Enter key to check whether it is present in the map or not");
		String check=sc.next();
		
		if (map.containsKey(check)) {
			System.out.println("Found:");
		}
		else
		{
			System.out.println("Not Found:");
		}
		return map;
		
	}
	// Main Method
	public static void main(String[] args) {

		// Creating map
		Map<String, Integer> map = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of test cases:");
		int totalTestCase = sc.nextInt();
		System.out.println("Please Enter"+""+ totalTestCase +""+"test cases value in the for of key value pair:");

		for (int i = 0; i < totalTestCase; i++) {
			System.out.println("Enter "+i+" Key:");
			String k = sc.next();

			System.out.println("Enter Value:");
			int v = sc.nextInt();
			
			map.put(k, v);

		}
		
		System.out.println(map);
		// Method calling
		Day8DictionaryAndMap.CheckWhetherKeyIsAvailable(map, sc);
		sc.close();

	}

}
