public class ReverseString {

	public static void main(String []args) {
		String a = "Name";
	
		// TimeComplexity is O(n)
		
		for (int i = a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		
		
		
	}
}
