package BasicString;

public class Basic3 {
		public static void main(String[] args) {
			System.out.println("I need to sleep");
			String desh = "Bangladesh";
			char ch= desh.charAt(0);
			System.out.println("Ch "+ ch);
			
			int value = desh.codePointAt(0); // askee value will return
			System.out.println(value);
			
			// Space Remove
			String name =  " Dipraj Howlader ";
			System.out.println("My name is " + name.trim());
			
			//Replace
			
			String s5 = "THis is my country and I love my country very much";
			String s6 = s5.replace("y", "D");
			System.out.println(s6);
			
			//Split method
			
			String[] s7 = s5.split(" ");
			
			for(String x : s7) {
				System.out.println(x);
			}
		}
}
