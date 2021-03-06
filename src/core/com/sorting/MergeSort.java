package core.com.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int []array, int iLeftIndex, int iMiddleIndex, int iRightIndex) {
		
		//TODO :
		/*
		 * we will merge the sorted array.
		 *  left_array => iLeftIndex To iMiddleIndex
		 *  right_aaray => iMiddleIndex+1 To iRightIndex
		 */
		
		// create two arrays which need to be merged 
		
		int _aLeft[] = new int [ (iMiddleIndex - iLeftIndex) +1  ];
		int _aRight[] = new int [iRightIndex - iMiddleIndex];
		
		for (int i = 0; i < _aLeft.length; i++) {
			_aLeft[i] = array[iLeftIndex+i];			
		}
		
		for (int i = 0; i < _aRight.length; i++) {
			_aRight[i] = array[iMiddleIndex+i+1];
		}
		
		int i = 0, j = 0, k = iLeftIndex;
		
		while (i < _aLeft.length && j < _aRight.length) {
			if (_aLeft[i] < _aRight[j]) {
				array[k] = _aLeft[i];
				i++;
			}else {
				array[k] = _aRight[j];
				j++;
			}
			k++;
		}
		
		while (i < _aLeft.length) {
			array[k] = _aLeft[i];
			i++;
			k++;
		}
		
		while (j < _aRight.length) {
			array[k] = _aRight[j];
			j++;
			k++;
		}
		
	}
	
	public static int [] sort(int [] array, int iLeftIndex, int iRightIndex) {
		if (iLeftIndex < iRightIndex) {
			int iMiddleIndex = (iLeftIndex+iRightIndex) / 2;
			sort(array, iLeftIndex, iMiddleIndex);
			sort(array, iMiddleIndex+1, iRightIndex);
			merge(array, iLeftIndex, iMiddleIndex, iRightIndex);
		}
		return array;
	}
	
	
	// Second approach	
	public static int [] mergeSort(int []arr) {
		int iLength = arr.length;
		
		if(iLength < 2) {
			return arr;
		}
		
		int iMid = iLength / 2;
		
		int leftArray[] = new int[iMid];
		int rightArray[] = new int[iLength - iMid];
		
		for (int i = 0; i < iMid; i++) {
			leftArray[i] = arr[i];
		}
		
		for (int i = 0; i < (iLength-iMid) ; i++) {
			rightArray[i] = arr[iMid + i];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);			
		merge1(arr, leftArray, rightArray);
		
		return arr;
	}
	
	// Merge method of second approach
	
	public static int [] merge1(int [] result, int []leftArr, int []rightArr) {
		int nL = leftArr.length;
		int nR = rightArr.length;
		
		int i = 0; int j = 0; int k =0;
		
		while(i < nL && j < nR) {
			if (leftArr[i] < rightArr[j]) {
				result[k] = leftArr[i];
				i++;
			}else {
				result[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < nL) {
			result[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < nR) {
			result[k] = rightArr[j];
			j++;
			k++;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================== Main Merge Sort Algorithm =============================");
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
		//int [] resultArray =  sort(inputArray, 0, inputArray.length-1); // First Approach
		int [] resultArray = mergeSort(inputArray); // Second approach
		for (int i = 0; i < resultArray.length; i++) {
			System.out.printf("%4d", resultArray[i]);
		}
		System.out.printf("]");
		System.out.println();
		System.out.println("========================== main ends here ====================================");
		
	}

}
