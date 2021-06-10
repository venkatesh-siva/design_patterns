package design_pattern.sortingAlgorithms;

/**
 * 
 * @author venka
 *
 * This class is an implementation of {@link ISorting} interface
 * It provides implementation of the SelectionSort Algorithm 
 */
public class SelectionSort implements ISorting {

	@Override
	public void sort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minindex]) {
					minindex = j;
				}
			}
			int temp = input[i];
			input[i] = input[minindex];
			input[minindex] = temp;
		}
	}

}
