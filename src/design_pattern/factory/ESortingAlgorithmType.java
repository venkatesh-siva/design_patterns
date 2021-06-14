package design_pattern.factory;

/**
 * 
 * @author venka
 *
 *	This enum contains all the types of sorting algorithm names
 */
public enum ESortingAlgorithmType {
	BUBBLE_SORT,
	SELECTION_SORT,
	INSERTION_SORT;
	
	public static void print() {
		ESortingAlgorithmType[] vals = ESortingAlgorithmType.values();
		for(int i = 0; i < vals.length; i++)
			System.out.println(i + ". " + vals[i]);
	}
}
