package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string1:");
		str1 = scanner.nextLine();
		System.out.println("enter String2:");
		str2 = scanner.nextLine();
		AnagramDetection anagramDetection = new AnagramDetection();
		boolean isAnagram = anagramDetection.isAnagram(str1, str2);
		if (isAnagram) {
			System.out.println("Two String are anagram");
		} else {
			System.out.println("Two String are not anagram");
		}
	}

	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}