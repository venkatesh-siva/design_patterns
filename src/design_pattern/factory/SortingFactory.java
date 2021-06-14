package design_pattern.factory;

import design_pattern.sortingAlgorithms.BubbleSort;
import design_pattern.sortingAlgorithms.InsertionSort;
import design_pattern.sortingAlgorithms.SelectionSort;
import design_pattern.sortingAlgorithms.ISorting;

/**
 * 
 * @author venka
 *
 *	This is the Factory class that creates objects of different types of sorting algorithms
 */
public class SortingFactory {
	
	/**
	 * 
	 * @param sortingType
	 * @return
	 */
	public static ISorting createObject(ESortingAlgorithmType sortingType) throws IllegalArgumentException {
		
		ISorting sort;
		
		switch (sortingType) {
			case BUBBLE_SORT:
				sort = new BubbleSort();
				break;
			case SELECTION_SORT:
				sort = new SelectionSort();
				break;
			case INSERTION_SORT:
				sort = new InsertionSort();
				break;
			default:
				throw new IllegalArgumentException("Invalid Sort Type");
		}

		return sort;
	}
}
