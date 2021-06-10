package uitls;

/**
 * This is a utility class which provide ability to interact with array providing functionalities like
 * 1. swapping
 * //TODO
 */
public class ArrayUtil {

	/**
	 * This function swaps the values of the positions inplace
	 * 
	 * @param firstIndex
	 * @param secondIndex
	 * @param inputArr
	 * 
	 */
	public static void swap(int firstIndex, int secondIndex, int[] inputArr) {
		int temp = inputArr[firstIndex];
		inputArr[firstIndex] = inputArr[secondIndex];
		inputArr[secondIndex] = temp;
	}
	
	/**
	 * This function converts the input string into an Integer array
	 * @param input
	 * @return int[]
	 */
	public static int[] convertStringToIntegerArr(String input) {
		String [] stringarr = input.split(" ");
		int[] intArr = new int[stringarr.length];
		
		for(int i = 0; i < stringarr.length ; i++) {
			intArr[i] = Integer.parseInt(stringarr[i]);
		}
		
		return intArr;
	}
	
	/**
	 * This function prints the integer array
	 * @param input
	 */
	public static void printArray(int[] input) {
		
		for(int val : input) {
			System.out.print(val + " ");
		}
	}
}
