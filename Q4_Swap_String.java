
public class Q4_Swap_String {

	public static void main(String[] args) {
		
		/// strings are assigned
		
		String str1 = "first word";
		String str2 = "second word";
		
		
		// printing string
		System.out.println("String 1 before : " + str1);
		System.out.println("String 2 before : " + str2);
		
		
		// strings are concated 
		str1 = str1 + str2;
		
		// str2 overrided by getting length (0,21-10) = (0,11) not including 11
		str2 = str1.substring(0,str1.length()-str2.length());
		
		// str1 is overrided by getting length of str 2 --- (11) -- start from 11 to end
		str1 = str1.substring(str2.length());
		
		
		// strings are printed after
		System.out.println("-----------------------------------");
		System.out.println("String 1 after : " + str1);
		System.out.println("String 2 after : " + str2);

	}

}
