import java.util.*;


/*Problem 2:  Determine whether a given string is Palindrome
A string “madam” is a palindromic string because it reads the same forwards and backward. 
Input: “anna”
Output: true
*/


public class Q2_string_palindrome {

	
	// function for Palindrome
	public static boolean isPalindrome(String str) {
		
		//variable for reversed string
		String reverse = "";

		
		//reversing string with loop
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		// checking if str and reverse string are same or not and returning true/false 
		// print statement just for test
		// here string is checked by ignoring case 
		
		if(reverse.equalsIgnoreCase(str)) { 
			System.out.println(str + " : is Palindrome");
			return true;
		}else {
			System.out.println(str + " : is not Palindrome");
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		// scanner object is created
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter String To Check Palindrome");
		
		// getting string from user to check
		String str = sc.nextLine();
		
		isPalindrome(str);	
	}

}
