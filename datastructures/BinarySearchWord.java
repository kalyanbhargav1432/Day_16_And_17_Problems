package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchWord {
	public static void main(String[] args) throws Exception {
		List<String> fileArray = new ArrayList<String>();
		BufferedReader bufferReader = new BufferedReader(
				new FileReader("E:/kalyan_java/practice/eclipse-workspace/wordlist.txt"));
		String saveLine;
		while ((saveLine = bufferReader.readLine()) != null) {
			fileArray.add(saveLine);
		}
		bufferReader.close();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key:");
		String inputString = scanner.nextLine();
		BinarySearchWord binarySerchFromFile = new BinarySearchWord();
		Arrays.sort(fileArray.toArray());
		System.out.println(fileArray);
		int index = binarySerchFromFile.binarySearchString(fileArray, inputString);
		if (index == -1) {
			System.out.println(" word Not found in file:" + inputString);
		} else {
			System.out.println(" word found in file:" + inputString);
		}
	}

	public int binarySearchString(List<String> array, String key) {
		int start = 0;
		int end = array.size();
		while (start < end) {
			int mid = (start + end) / 2;
			// System.out.println(mid);
			if (key.compareTo((String) array.toArray()[mid]) < 0) {
				end = mid;
			} else if (key.compareTo((String) array.toArray()[mid]) > 0) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}