package core.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindingDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
				System.out.println("******************************************* Main Start *******************************************");
				System.out.println("==================================================================================================");
				
				Integer[] iArr1 = new Integer[] {10,2,3,5,7,2,9,1,10};
				List<Integer> list = Arrays.asList(new Integer[] {10,2,3,5,7,2,9,1});
				System.out.println("Array => "+list);
				Set<Integer> set1 = new HashSet<>();
				Set<Integer> result = new HashSet<>();
				for (int i = 0; i < iArr1.length; i++) {
					if (set1.add(iArr1[i])) {
						System.out.println("added element successfully...");
					}else {
						result.add(iArr1[i]);
					}
				}
				System.out.println("Duplicate Entries => "+result);
				System.out.println("==================================================================================================");
				System.out.println("******************************************* Main End *********************************************");
		
	}

}
