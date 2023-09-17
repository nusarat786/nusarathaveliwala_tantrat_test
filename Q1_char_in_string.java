import java.util.*;
/*
Problem 1: Program to count occurrences of a given character in a string.

Count character 'e' in the below string.
	Input "geeksforgeeks". 
	Output: 4
*/

public class Q1_char_in_string {

	// method for finding char occurunce
	public static int getCharOccurrunce(String str,char ch) {
		
		// count is takeken to count total times
		int count =0;
		
		//for loop is used to traverse array and increments count every time a char is found
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}	
		}
		
		// print is addaed just for testing purpose
		System.out.println("Total : " + count + " Times " + ch + " is present in String :"  +str);
		
		
		// return the occurrence 
		return count;
		
	}
	
	public static void main(String[] args) {
		
		// scanner object is created for taking user input
		Scanner sc = new Scanner(System.in);
		
		
		// geting string input from user
		System.out.println(" Enter String To Find Character Occurrence: ");
		String str = sc.nextLine();
		
		// geting char input
		System.out.println(" Enter Char To Find it's Occurrence in Given String: ");
		char ch = sc.next().charAt(0);
		
		
		getCharOccurrunce(str,ch);

	}
	
	
}
