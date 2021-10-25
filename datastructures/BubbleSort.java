package datastructures;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total Number of Array Elements You Want To sort: ");
		int totalElements = scanner.nextInt();
		int arr[] = new int[totalElements];
		System.out.println("Enter " + totalElements + " Array Elements: ");
		for (int i = 0; i < totalElements; i++)
			arr[i] = scanner.nextInt();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr, totalElements);
	}

	private void sort(int[] arr, int arrLength) {
		System.out.println("Before Sorting");
		for (int i = 0; i < arrLength; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nAfter Sorting\n");
		for (int i = 0; i < arrLength - 1; i++) {
			for (int j = 0; j < arrLength - i - 1; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arrLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
