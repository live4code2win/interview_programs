package core.com.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] bubbleSort(int [] array) {
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array.length - i -1 ;j++) {
				if (array[j] > array[j+1]) {
					int iTempItem = array[j];
					array[j] = array[j+1];
					array[j+1] = iTempItem;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================== Main Bubble Sort Algorithm =============================");
		//int [] inputArray = {22,7,91,5,3,19,60,41,56,8};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        int iElements = sc.nextInt();
        int inputArray[] = new int[iElements];
        System.out.printf("Enter all the elements:=>");
        for(int i = 0; i < iElements; i++)
        {
        	inputArray[i] = sc.nextInt();
        }
		System.out.println("==============================================================================");
		System.out.printf("Input Array => [");
		//int [] inputArray = {2,7,1,5,3,9,0,4,6,8};
		for (int i = 0; i < inputArray.length; i++) {
			System.out.printf("%4d", inputArray[i]);
		}
		System.out.printf("]");
		System.out.println();
		System.out.println("==============================================================================");
		System.out.printf("Sorted Array => [");
		int [] resultArray =  bubbleSort(inputArray);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.printf("%4d", resultArray[i]);
		}
		System.out.printf("]");
		System.out.println();
		System.out.println("========================== main ends here ====================================");

	}

}
