package BasicString;

import java.util.*;


public class Palindrome {
	//String builder and reverse
	
	public static void main(String[] args) {
		System.out.println("---String Palindrome---");
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String st = input.next();
		System.out.println(st);
		StringBuilder bu = new StringBuilder("Madam");
		
		StringBuilder cha = new StringBuilder();
		cha = bu.reverse();
		
		System.out.println(cha);
		cha.append(false);
		cha.append(12.5);
		cha.append("Sipraj");
		System.out.println(cha);
		
	}
}
