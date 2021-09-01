package BasicString;

public class WrapperClass {
	public static void main(String[] args) {
		System.out.println("---Wrapper Class---");
		
		//Convert Primitive data type to Object class
		
		//AutoBoxing . primitive to Object
		//Unboxing . Object to primitive
		
		int x = 30;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		// Autoboxing
		Integer z = x; // integer.valueof
		System.out.println(z);
		// Unboxing
		Double d = new Double(10.55);
		System.out.println(d);
		
		double e = d.doubleValue();
		System.out.println(e);
		
		
		double f = d;
		System.out.println(f);
		
		
	}
}
