package core.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class FindingPairInArrayWithKDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******************************************* Main Start *******************************************");
		System.out.println("==================================================================================================");
		
		Integer[] iArr1 = new Integer[] {10,2,3,5,7,2,9,1};
		List<Integer> list = Arrays.asList(new Integer[] {10,2,3,5,7,2,9,1});
		System.out.println("Array => "+list);
		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println("Tree  => "+set);
		
		HashMap<String, Integer> mapResult = new HashMap<>();
		int iConstant = 1;
		for (int i = 0; i < iArr1.length; i++) {
			int iElement = iArr1[i];
			int iLeft = iElement - iConstant;
			int iRight = iElement + iConstant;
			String leftPair = "";
			String rightPair = "";
			if (set.contains(iLeft)) {
				leftPair = "("+iLeft+","+iElement+")";
				mapResult.put(leftPair, iElement);
			}
			if (set.contains(iRight)) {
				rightPair = "("+iElement+","+iRight+")";
				mapResult.put(rightPair, iElement);
			}
		}
		System.out.println("Count => "+mapResult.size()+" paires => "+mapResult.keySet());
		System.out.println("******************************************* Main End *********************************************");
	}

}
