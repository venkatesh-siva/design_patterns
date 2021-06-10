package design_pattern;

import java.util.Scanner;

import design_pattern.abstractFactory.ESortingAlgorithmType;
import design_pattern.abstractFactory.SortingFactory;
import design_pattern.sortingAlgorithms.ISorting;
import uitls.ArrayUtil;

public class DesignPatternRunner {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter space separated integer values");
		String inputarr = scanner.nextLine();
		int[] input = ArrayUtil.convertStringToIntegerArr(inputarr);
		
		System.out.println("Please choose the sorting algorithm");
		ESortingAlgorithmType.print();
		String sortType = scanner.nextLine();

		int enumval = Integer.parseInt(sortType);
		if (enumval < ESortingAlgorithmType.values().length) {
			ISorting sorting = SortingFactory.createObject(ESortingAlgorithmType.values()[enumval]);
			sorting.sort(input);
			
			ArrayUtil.printArray(input);
		}
		else
			System.out.println("Wrong sort type entered. Please provide available sort type");
	}
}
