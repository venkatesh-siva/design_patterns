package design_pattern.sortingAlgorithms;

/**
 * 
 * @author venka
 *
 * This class is an implementation of {@link ISorting} interface
 * It provides implementation of the InsertionSort Algorithm 
 * 
 */
public class InsertionSort implements ISorting{

	@Override
	public void sort(int[] input) {
		
		for(int i = 1; i < input.length; i++) {
			int j = i;
			while(j >= 1 && input[j] < input[j-1]) {
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j--;
			}
		}
	}

		
}
