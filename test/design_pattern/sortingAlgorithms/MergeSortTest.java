package design_pattern.sortingAlgorithms;

import org.junit.Before;
import org.junit.Test;

import uitls.ArrayUtil;

public class MergeSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MergeSort mergeSort = new MergeSort();
		int[] result = new int[]{1, 5, 3, 3, 2, 4};
		mergeSort.sort(result);
		
		//int [] left = new int[] {1, 3, 5};
		//int [] right = new int[] {2, 3, 4};
		
		//int[] result = ArrayUtil.mergeSortedArrays(left, right);
		
		ArrayUtil.printArray(result);
	}

}
