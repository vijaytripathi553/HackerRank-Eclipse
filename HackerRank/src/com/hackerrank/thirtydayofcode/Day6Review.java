package com.hackerrank.thirtydayofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter totla no of test cases:");
		int totalTestCase = sc.nextInt();
		// Creating an array of size totalCase
		for (int i = 0; i < totalTestCase; i++) {
			String s = sc.next(); /*
									 * If i pass totalTestCase 2 then in s we are storing s=Hacker s=Rank In short ,
									 * in s we are storing no of test cases string
									 */
			// Now converting that string to array
			char c[] = s.toCharArray(); // Suppose you passed 'Hacker'. So in char array it will be look like
										// 'H','a','c','k','e','r'
			for (int j = 0; j < c.length; j++) {
				if (j % 2 == 0) {
					String s1=new String(c);     // Converting from character array to string
					System.out.print(s1.charAt(j));
				}
				
				}
			System.out.print(" ");
			
			
			
			// Taking one more inner loop to print odd index values
			for (int k = 0; k < c.length; k++) {
				if (k % 2 != 0) {
					String s2=new String(c);     // Converting from character array to string
					System.out.print(s2.charAt(k));
				}
				
				}
			System.out.println();
			
			
				
				
				

			}
			//System.out.println(l1);

		}

	}

