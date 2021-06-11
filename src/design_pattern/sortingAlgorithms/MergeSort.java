package design_pattern.sortingAlgorithms;

public class MergeSort implements ISorting{

	@Override
	public void sort(int[] input) {
		splitAndMerge(input, 0, input.length - 1);
	}
	
	private void splitAndMerge(int[] input, int left, int right) {
		if(left < right){
			int mid = left + ((right - left ) / 2);
			
			
			splitAndMerge(input, left, mid);
			splitAndMerge(input, mid + 1, right);
			merge(input, left, right, mid);
		}
	}
	
	private void merge(int[] input, int left, int right, int mid) {
		int[] leftArr = new int[mid-left+1];
		int[] rightArr = new int[right-mid];
		
		for(int i = 0; i < leftArr.length; i++) {
			leftArr[i] = input[i+left];
		}
		
		for(int i = 0; i < rightArr.length; i++) {
			rightArr[i] = input[i+mid+1];
		}
		
		
		int leftLength = leftArr.length;
		int rightLength = rightArr.length;

		//int[] resultArr = new int[leftLength + rightLength];
		int i = 0;
		int j = 0;
		int index = left;

		while (i < leftLength && j < rightLength) {
			if (leftArr[i] <= rightArr[j]) {
				input[index] = leftArr[i];
				i++;
				index++;
			} else {
				input[index] = rightArr[j];
				j++;
				index++;
			}
		}
		
		
		while(i < leftLength) {
			input[index] = leftArr[i];
			i++;
			index++;
		}
		
		while(j < rightLength) {
			input[index] = rightArr[j];
			j++;
			index++;
		}
		
		
	}
	
	

}
