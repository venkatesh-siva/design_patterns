package uitls;

/**
 * This is a utility class which provide ability to interact with array
 * providing functionalities like 1. swapping //TODO
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
	 * 
	 * @param input
	 * @return int[]
	 */
	public static int[] convertStringToIntegerArr(String input) {
		String[] stringarr = input.split(" ");
		int[] intArr = new int[stringarr.length];

		for (int i = 0; i < stringarr.length; i++) {
			intArr[i] = Integer.parseInt(stringarr[i]);
		}

		return intArr;
	}

	/**
	 * This function prints the integer array
	 * 
	 * @param input
	 */
	public static void printArray(int[] input) {

		for (int val : input) {
			System.out.print(val + " ");
		}
	}

	/**
	 * 
	 * @param arrayLeft
	 * @param arrayRight
	 * @return
	 */
	public static int[] mergeSortedArrays(int[] arrayLeft, int[] arrayRight) {
		int leftLength = arrayLeft.length;
		int rightLength = arrayRight.length;

		int[] resultArr = new int[leftLength + rightLength];
		int i = 0;
		int j = 0;
		int index = 0;

		while (i < leftLength && j < rightLength) {
			if (arrayLeft[i] <= arrayRight[j]) {
				resultArr[index] = arrayLeft[i];
				i++;
			} else {
				resultArr[index] = arrayRight[j];
				j++;
			}
			index++;
		}
		
		
		while(i < leftLength) {
			resultArr[index] = arrayLeft[i];
			i++;
			index++;
		}
		
		while(j < rightLength) {
			resultArr[index] = arrayRight[j];
			j++;
			index++;
		}
		
		
		return resultArr;
	}
}
