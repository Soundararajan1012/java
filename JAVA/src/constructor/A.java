package constructor;

public class A extends B 
{
	
		 public A() {
		 System.out.println("Default const...");
		 }
		 public static void main(String[] args) {
		    new A();
		    new B(11);
		 }
		 

}
