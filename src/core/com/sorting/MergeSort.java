package core.com.sorting;

public class MergeSort {

	public void merge(int []array, int left_index, int middle_index, int right_index) {
		
	}
	
	public int [] sort(int [] array, int left_index, int right_index) {
		
		int iMiddle_index = left_index+right_index / 2;
		sort(array, left_index, iMiddle_index);
		sort(array, iMiddle_index+1, right_index);
		
		return array;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================= Main ========================");
		System.out.println("================= main ends here ========================");
		
	}

}
