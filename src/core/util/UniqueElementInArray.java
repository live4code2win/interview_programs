package core.util;

public class UniqueElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	}

}
