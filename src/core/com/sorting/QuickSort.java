package core.com.sorting;

import java.util.Scanner;

public class QuickSort {

	public static int partition (int []array, int startIndex, int endIndex) {
		int iPartitionIndex = 0;
		iPartitionIndex = startIndex;
		int iPivotElement = array[endIndex];
		for (int i = startIndex; i < endIndex ; i++) {
			if (array[i] < iPivotElement) {
				int iTemp = array[i];				
				array[i] = array[iPartitionIndex];
				array[iPartitionIndex] = iTemp;
				iPartitionIndex++;
			}
		}
		
		// swap pivot with pivot index place 
		int iTempElement = array[iPartitionIndex];
		array[iPartitionIndex] = iPivotElement;
		array[endIndex] = iTempElement;
		return iPartitionIndex;
	}
	
	public static void swap() {
		
	}
	
	public static int[] quickSort(int []array, int startIndex, int endIndex) {
		if (startIndex <= endIndex) {
			int iPartitionIndex = partition(array, startIndex, endIndex);
			quickSort(array, startIndex, iPartitionIndex-1);
			quickSort(array, iPartitionIndex+1, endIndex);
		}
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("====================== Main Quick Sort Algorithm =============================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        int iElements = sc.nextInt();
        int inputArray[] = new int[iElements];
        System.out.printf("Enter all the elements:=>");
        for(int i = 0; i < iElements; i++)
        {
        	inputArray[i] = sc.nextInt();
        }
        sc.close();
		System.out.println("==============================================================================");
		System.out.printf("Input Array => [");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.printf("%4d", inputArray[i]);
		}
		System.out.printf("]");
		System.out.println();
		System.out.println("==============================================================================");
		System.out.printf("Sorted Array => [");
		int [] resultArray =  quickSort(inputArray, 0, inputArray.length-1);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.printf("%4d", resultArray[i]);
		}
		System.out.printf("]");
		System.out.println();
		System.out.println("========================== main ends here ====================================");
	}

}
