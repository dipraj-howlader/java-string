package AdvanceString;

public class ReverseConversation {
	public static void main(String[] args) {
		// Decimal to Binary
		int deci = 15;
		String binary = Integer.toBinaryString(deci);
		System.out.println(binary);
		
		// Decimal to Oct
		int dec = 5688;
		String oct  = Integer.toOctalString(dec);
		System.out.println(oct);
		
		// Decimal to hexadecimal
		int de = 256;
		String hex = Integer.toHexString(de);
		System.out.println(hex);
	}
}
