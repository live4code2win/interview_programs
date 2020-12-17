package core.util;

import java.util.HashMap;

public class UniqueElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The same can be used to find the odd duplicated element in the array.
		// Pre-requisite is that all other duplicated element must be in even number 
		System.out.println("*****************************************************************************************************************************************");
		int [] array = {10, 2, 12, 10, 2, 15, 12, 15, 1, 3, 17, 3,17, 1, 60};		
		int iResult = 0;		
		for (int i = 0; i < array.length; i++) {
			iResult = iResult ^ array[i];
		}
		System.out.printf("Input array => [");
		for (int i : array) {
			System.out.printf("%d", i);
			System.out.printf("\t");
		}
		System.out.printf("]");
		System.out.println();		
		System.out.println("Unique interger => "+iResult);
		System.out.println("*****************************************************************************************************************************************");
		System.out.println("Array with all duplicates number but in even and odd number of duplicates, (Only one element is in odd duplicate count )");
		int [] array1 = {10, 60, 2, 12, 12, 10, 2, 15, 12, 15, 1, 3, 17, 3,17, 1, 60, 1, 1,60, 60, 12, 2};		
		HashMap<Integer, Integer> map = new HashMap<>();
		int iResult1 = 0;		
		for (int i = 0; i < array1.length; i++) {
			iResult1 = iResult1 ^ array1[i];			
			Integer number = map.get(array1[i]);
			map.put(array1[i], number == null ? 1 : (number+1));
		}
		System.out.printf("Input array => [");
		for (int i : array1) {
			System.out.printf("%d", i);
			System.out.printf("\t");
		}
		System.out.printf("]");
		System.out.println();	
		System.out.println("Number count => "+map);
		System.out.println("Unique interger => "+iResult1);
		System.out.println("*****************************************************************************************************************************************");
		/*
		 * Note :- In actual program HashMap is not used its for our understanding, to display the count for each number in the array.
		 */
	}

}
