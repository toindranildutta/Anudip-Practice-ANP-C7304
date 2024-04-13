package submission1;

import java.util.Scanner;

public class ClassStringSubSequence {
		
	private String str1; //variable
	private String str2;
	
	public ClassStringSubSequence(String s1, String s2) { //parameterized constructor
		this.str1 = s1;
		this.str2 = s2;
	}
	
	public String stringSubsequence() { // subsequence checker method
		int i = 0;
		int j = 0;
		while(i<str1.length() && j<str2.length()) { // how long loop will run
			if(str1.charAt(i) == str2.charAt(j)) { // checking each character one by one.
				j++;
			}
			i++;
		}
		
		return (j == str2.length() ? "Yes" : "No"); // to replace true false value
		
		
	}

	public static void main(String[] args) { // main method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String s1: "); //1st input
		String firstString = scanner.next();
		System.out.println("Enter another String s2: "); //2nd input
		String compareWith = scanner.next();
		
		ClassStringSubSequence checkSubString = new ClassStringSubSequence(firstString, compareWith);
		System.out.println(checkSubString.stringSubsequence()); //method calling
		
		scanner.close();
	}
	

}

