package tech.asmussen.tasks.gp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralProgramming {
	
	public static void main(String[] args) {
		
		// Swap two numbers.
		int a = 1;
		int b = 2;
		
		System.out.println("Swap Two Numbers:");
		System.out.printf("A = %d\n", a);
		System.out.printf("B = %d\n", b);
		swapTwo(a, b);
		
		// Swap three numbers.
		int c = 3;
		
		System.out.println("Swap Three Numbers:");
		System.out.printf("A = %d\n", a);
		System.out.printf("B = %d\n", b);
		System.out.printf("C = %d\n", c);
		swapThree(a, b, c);
		
		// Check if a word is a palindrome.
		String word = "racecar";
		
		System.out.println("Check If A Word Is A Palindrome:");
		System.out.printf("Word = %s\n", word);
		System.out.printf("Is Palindrome: %b\n", isPalindrome(word));
		
		// Check the number of steps in a linear search.
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int value = 5;
		
		System.out.println("Check The Number Of Steps In A Linear Search:");
		System.out.printf("Value = %d\n", value);
		System.out.printf("Steps: %d\n", stepsInLinearSearch(value, array));
		
		// Check the number of steps in a binary search.
		System.out.println("Check The Number Of Steps In A Binary Search:");
		System.out.printf("Value = %d\n", value);
		System.out.printf("Steps: %d\n", stepsInBinarySearch(value, array));
		
		// Insert sorted list.
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int valueToInsert = 5;
		
		System.out.println("Insert Sorted List:");
		System.out.printf("Value To Insert = %d\n", valueToInsert);
		System.out.printf("Sorted Array: %s\n", Arrays.toString(sortedArray));
		System.out.printf("New Array: %s\n", Arrays.toString(insertSortedList(valueToInsert, sortedArray)));
		
		// Array of multiples.
		int multiple = 5;
		int length = 10;
		
		System.out.println("Array Of Multiples:");
		System.out.printf("Multiple = %d\n", multiple);
		System.out.printf("Length = %d\n", length);
		System.out.printf("Array: %s\n", Arrays.toString(arrayOfMultiples(multiple, length)));
		
		// Find powers in range.
		int power = 2;
		int lowerBound = 1;
		int upperBound = 100;
		
		System.out.println("Find Powers In Range:");
		System.out.printf("Lower Bound = %d\n", lowerBound);
		System.out.printf("Upper Bound = %d\n", upperBound);
		System.out.printf("Powers: %s\n", findPowersInRange(power, lowerBound, upperBound));
		
		// Get the factorial of a number.
		int number = 4;
		
		System.out.println("Get The Factorial Of A Number:");
		System.out.printf("Number = %d\n", number);
		System.out.printf("Factorial: %d\n", factorial(number));
		
		// Increment a string.
		String string = "Hello99"; // -> Hello100
		
		System.out.println("Increment A String:");
		System.out.printf("String = %s\n", string);
		System.out.printf("Incremented String: %s\n", incrementString(string));
		
		// Check if a password is valid.
		String password = "Password123!";
		
		System.out.println("Check If A Password Is Valid:");
		System.out.printf("Password = %s\n", password);
		System.out.printf("Is Valid: %b\n", isValidPassword(password));
	}
	
	public static void swapTwo(int a, int b) {
		
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.printf("A = %d\n", a);
		System.out.printf("B = %d\n", b);
		System.out.printf("Temp = %d\n", temp);
	}
	
	public static void swapThree(int a, int b, int c) {
		
		int temp = a;
		
		a = b;
		b = c;
		c = temp;
		
		System.out.printf("A = %d\n", a);
		System.out.printf("B = %d\n", b);
		System.out.printf("C = %d\n", c);
		System.out.printf("Temp = %d\n", temp);
	}
	
	public static boolean isPalindrome(String word) {
		
		StringBuilder reversedWord = new StringBuilder();
		
		for (int i = word.length() - 1; i >= 0; i--) {
			
			reversedWord.append(word.charAt(i));
		}
		
		return word.equalsIgnoreCase(reversedWord.toString());
	}
	
	public static int stepsInLinearSearch(int value, int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == value) {
				
				System.out.printf("Found %d at index %d!\n", value, i);
				
				return i;
			}
			
			System.out.printf("Checked index %d.\n", i);
		}
		
		System.out.printf("Failed to locate %d!\n", value);
		
		return -1;
	}
	
	public static int stepsInBinarySearch(int value, int[] array) {
		
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		
		while (low <= high) {
			
			if (array[mid] < value) {
				
				low = mid + 1;
				
			} else if (array[mid] == value) {
				
				System.out.printf("Found %d at index %d!\n", value, mid);
				
				return mid;
				
			} else {
				
				high = mid - 1;
			}
			
			mid = (low + high) / 2;
			
			System.out.printf("Checked index %d.\n", mid);
		}
		
		System.out.printf("Failed to locate %d!\n", value);
		
		return -1;
	}
	
	public static int[] insertSortedList(int value, int[] array) {
		
		int[] newArray = new int[array.length + 1];
		
		int i = 0;
		for (; i < array.length; i++) {
			
			if (array[i] > value) break;
			
			newArray[i] = array[i];
		}
		
		newArray[i] = value;
		
		if (newArray.length - (i + 1) >= 0)
			System.arraycopy(array, i + 1 - 1, newArray, i + 1, newArray.length - (i + 1));
		
		return newArray;
	}
	
	public static int[] arrayOfMultiples(int n, int length) {
		
		int[] array = new int[length];
		
		int checkNumber = 0;
		
		int valuesFound = 0;
		int i = 0;
		while (valuesFound < length) {
			
			if (++checkNumber % n != 0) continue;
			
			valuesFound++;
			array[i++] = checkNumber;
		}
		
		return array;
	}
	
	public static int[] findPowersInRange(int power, int from, int to) {
		
		if (from > to) return new int[0];
		
		List<Double> powers = new ArrayList<>();
		
		int value = 0;
		for (int i = from; i < to; i++) {
			
			double raisedValue = Math.pow(value++, power);
			
			powers.add(raisedValue);
		}
		
		return powers.stream().mapToInt(Double::intValue).toArray();
	}
	
	public static long factorial(int n) {
		
		if (n < 0) return -1;
		
		long result = 1;
		
		for (int i = 1; i <= n; i++) {
			
			result *= i;
		}
		
		return result;
	}
	
	public static String incrementString(String s) {
		
		StringBuilder output = new StringBuilder();
		
		// Find the number:
		int i = s.length() - 1;
		while (i >= 0 && Character.isDigit(s.charAt(i))) {
			
			output.append(s.charAt(i--));
		}
		
		output.reverse();
		
		int number = Integer.parseInt(output.toString());
		
		// Get the string:
		output = new StringBuilder();
		
		for (int j = 0; j < s.length() - output.length(); j++) {
			
			output.append(s.charAt(j));
		}
		
		// Increment the number:
		output.append(++number);
		
		// Return the result:
		return output.toString();
	}
	
	public static boolean isValidPassword(String password) {
		
		final int minLength = 8;
		final int maxLength = 25;
		
		final String validSpecialCharacters = "!@#$%^&*()+=-{}[]:;\"'?<>,._";
		
		boolean foundLowercase = false;
		boolean foundUppercase = false;
		boolean foundNumber = false;
		boolean foundSpecialCharacter = false;
		
		if (password.length() < minLength || password.length() > maxLength) return false;
		
		for (int i = 0; i < password.length(); i++) {
			
			char c = password.charAt(i);
			
			if (Character.isLowerCase(c)) {
				
				foundLowercase = true;
				
			} else if (Character.isUpperCase(c)) {
				
				foundUppercase = true;
				
			} else if (Character.isDigit(c)) {
				
				foundNumber = true;
				
			} else if (validSpecialCharacters.indexOf(c) != -1) {
				
				foundSpecialCharacter = true;
				
			} else {
				
				return false;
			}
		}
		
		return foundLowercase && foundUppercase && foundNumber && foundSpecialCharacter;
	}
}
