package AdvanceString;

public class ConversationBinary {
	public static void main(String[] args) {
		//Binary coversation to Decimal
		String binary = "1010010100";
		Integer b = Integer.parseInt(binary, 2);
		System.out.println(b);
		
		// Octal to Decimal
		String oct = "2567";
		Integer o = Integer.parseInt(oct, 8);
		System.out.println(o);
		// Hexadicilam to Decimal
		String hex = "AB";
		Integer h = Integer.parseInt(hex, 16);
		System.out.println(h);
	}
}
