
/*Write a program to print the biggest and smallest number in the array. 

Input: arr[] = {1, 2, 3, 4, 5}
Output: Maximum is: 5
Minimum is: 1

Input: arr[] = {5, 3, 7, 4, 2}
Output: Maximum is: 7
Minimum is: 2

*/

public class Q3_biggest_smallest_number {

	public static void main(String[] args) {
		// here array is declared directly (we can also have this with user input )
		int [] array = {26,76,89,90,23,56};

		
		// here variables are created to store min and max value
		// first index element is assigned just to compare later 
		int max = array[0];
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			
			// loop to check and compere value one by one
			// max and min value are overrided by condtion
			
			if(array[i]>max) {
				max=array[i];
			}
			
			if(array[i]<min) {
				min=array[i];
			}
		}
		
		// min and max value are printed
		System.out.println("Minimum Number In Array Is: " + min+ "\n" +
						   "Maximum Number In Array Is: "+ max);
		
	}
}
