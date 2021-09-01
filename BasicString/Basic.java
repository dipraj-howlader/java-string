package BasicString;

public class Basic {
	public static void main(String[] args) {
		System.out.println("---Hello Coders, Welcome to Java world---");
		
		// String class
		String s1 = "Dipraj Howlader";
		System.out.println(s1);
		
		String s2 = new String("dipraj Howlader");
		System.out.println(s2);
		
		char[] s3 = {'D','I','P'};
		System.out.println(s3);
		System.out.println("Length of S1 :"+ s1.length());
		
		//Checking Equals
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equal");
		}
		//equals Ignor Case
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equal");
		}
		
		
		
	}
}
