package BasicString;

public class basic2 {
	public static void main(String[] args) {
		System.out.println("String er bap er bap");
		String firstName= "Dipraj ";
		String secondName = "Howlader";
		
		String fullName = firstName+secondName;
		System.out.println("Full name :" + fullName + 25);
		System.out.println("Full Name upper " + fullName.toUpperCase());
		System.out.println("Lower Name :" + fullName.toLowerCase());
		
		boolean b = firstName.startsWith("Dip");
		System.out.println("Starting with D is:" + b);
		
		boolean c = secondName.endsWith("er");
		System.out.println("Ending is:" + c);
		
		//
	}
}
