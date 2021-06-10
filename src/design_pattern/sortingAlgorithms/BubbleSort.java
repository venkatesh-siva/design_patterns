package design_pattern.sortingAlgorithms;

/**
 * 
 * @author venka
 *
 * This class is an implementation of {@link ISorting} interface
 * It provides implementation of the BubbleSort Algorithm 
 */
public class BubbleSort implements ISorting {

	@Override
	public void sort(int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}

			}
		}
	}

}
