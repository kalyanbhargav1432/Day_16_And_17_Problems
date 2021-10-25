package datastructures;

import java.util.Scanner;

public class InsertionSort {
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(String.valueOf(arr[i] + " "));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many elements do u want to insert:");
		int elements = scanner.nextInt();
		System.out.println("TOtal SIze = " + elements);
		String str[] = new String[elements];
		System.out.println("Entre Numbers To Sort: ");
		int arr[] = new int[elements];
		for (int i = 0; i < elements; i++) {
			str[i] = scanner.next();
			arr[i] = Integer.parseInt(str[i]);

		}

		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		printArray(arr);
	}
}