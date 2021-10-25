package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
	public PrimeNumbers(int num) {
		int i;
		int j;
		List<Integer> list = new ArrayList<>();
		List<String> primeList = new ArrayList<>(), anagramList = new ArrayList<>();
		for (i = 2; i < num; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j == i) {
				System.out.println(i);

				primeList.add(Integer.toString(i));
			}
		}
		System.out.println();
		System.out.println("Prime Numbers List: " + primeList);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int num = scanner.nextInt();
		PrimeNumbers prime = new PrimeNumbers(num);
	}
}