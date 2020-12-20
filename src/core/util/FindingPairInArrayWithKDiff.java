package core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class FindingPairInArrayWithKDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******************************************* Main Start *******************************************");
		int  []iArr = new int[]{10,2,3,5,7,2,9,1};
		System.out.printf("Given Array => [");
		for (int i : iArr) {
			System.out.printf("%4d", i);
		}
		System.out.printf("  ]");
		System.out.println();
		System.out.println("==================================================================================================");
		System.out.println("Difference constance => 2");
		Arrays.sort(iArr);
		System.out.printf("Array => [");
		for (int i : iArr) {
			System.out.printf("%4d", i);
		}
		System.out.printf("   ]");
		System.out.println();
		System.out.println("==================================================================================================");
		
		int iLeftMostElement = iArr[0];
		int iRightMostElement = iArr[iArr.length];
		//List<Integer> al = Arrays.asList(iArr);
		
		Integer[] iArr1 = new Integer[] {10,2,3,5,7,2,9,1};
		List<Integer> list = Arrays.asList(new Integer[] {10,2,3,5,7,2,9,1});
		TreeSet<Integer> set = new TreeSet<>(list);
		//TreeSet<Integer> tsElements = new TreeSet<>(new ArrayList<>(Arrays.asList(iArr)));
		
		String strAddedItems = ""; 
		for (int i = 0; i < iArr.length; i++) {
			
			
		}
		
		System.out.println("******************************************* Main End *********************************************");

	}

}
