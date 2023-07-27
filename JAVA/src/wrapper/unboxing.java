package wrapper;

public class unboxing {

	public static void main(String[] args) {
		// converting Integer into int
		Integer a=new Integer(3);
		//converting Integer to int explicity
		int i=a.intValue();
		int j=a;//unboxing, now compiler will write a.intvalue() inter
		//System.out.println(a+" "+i+" "+j);
		System.out.println("Object variable value--->"+a);
		System.out.println("Integer to int explicity--->"+i);
		System.out.println("Object to primitive--->"+j);
		
		

	}

}
