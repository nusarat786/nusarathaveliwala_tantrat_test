
public class Q5_swap_number {

	public static void main(String[] args) {
		
		// variables are created for storing 2 numbers
		int a = 20;
		int b = 30;
		
		
		// printing string
		System.out.println("before a = " + a);
		System.out.println("before b = " + b);
		
		// logic is written
		
		a = a+b; // 20 + 30
		b = a-b; // 50 - 30 = 20
		a = a-b; // 50 - 20 = 30
		
		System.out.println("------------------------------" + a);
		System.out.println("after a = " + a);
		System.out.println("after b = " + b);

	}
}
