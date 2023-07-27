package collections;

import java.util.Stack;

public class stackaccessingtheelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack1=new Stack<String>();
		stack1.push("welcome");
		stack1.push("To");
		stack1.push("Geeks");
		stack1.push("For");
		stack1.push("Geeks");
		System.out.println("Initial Stack:"+stack1);
		System.out.println("The element at the top of the"+"stack is:"+stack1.peek());
		System.out.println("Full stack:"+stack1);

	}

}
