package wrapper;

public class autoboxing {

	public static void main(String[] args) {
		// converting int into Integer
		int a=20;
		//converting int into Integer explicity
		Integer i=Integer.valueOf(a);
		//autoboxing, now compiler will write Integer.valueof(a)
		Integer j=a;
		System.out.println("Local variable--->"+a);
		System.out.println("Integer explicity--->"+i);
		System.out.println("Local variable--->"+j);

	}

}
