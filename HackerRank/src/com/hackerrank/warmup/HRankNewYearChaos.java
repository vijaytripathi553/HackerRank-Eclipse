package com.algotutor.twopointer;

import java.util.*;

public class HRankNewYearChaos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int noOfElements = sc.nextInt();
            int[] array1 = new int[noOfElements];

            for (int j = 0; j < noOfElements; j++) {
                array1[j] = sc.nextInt();
            }
            
            int newArray[]=Arrays.copyOf(array1, array1.length);
        int sortedArray[]=sortArray(array1);

            // Get the minimum number of bribes needed
            Object result = logicToPrintMinBribes(sortedArray,newArray);
            System.out.println(result);
        }
    }
    
    // Method to sort the array elements
    private static int[] sortArray(int array1[])
    {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i]<array1[j])
                {
                    int temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                            
                }
                
            }
            
        }
        return array1;
    }
    

    private static Object logicToPrintMinBribes(int[] sortedArray, int[] newArray) {
    int bribesCount = 0;

    for (int i = newArray.length - 1; i > 0; i--) {
        if (newArray[i] == sortedArray[i]) {
            continue; // Element is already in correct position
        } else if (newArray[i-1] == sortedArray[i]) {
            // One bribe needed: Move newArray[i-1] to newArray[i]
            int temp = newArray[i-1];
            newArray[i-1] = newArray[i];
            newArray[i] = temp;
            bribesCount++;
        } else if (i > 1 && newArray[i-2] == sortedArray[i]) {
            // Two bribes needed: Move newArray[i-2] to newArray[i-1] and newArray[i-1] to newArray[i]
            int temp1 = newArray[i-2];
            newArray[i-2] = newArray[i-1];
            newArray[i-1] = newArray[i];
            newArray[i] = temp1;
            bribesCount += 2;
        } else {
            // If none of the above conditions match, the sequence is too chaotic
            return "Too chaotic";
        }
    }

    return bribesCount;
}

}
