package collections;

import java.util.Stack;

public class stackremovingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		stack1.push(10);
		stack1.push(15);
		stack1.push(30);
		stack1.push(20);
		stack1.push(5);
		System.out.println("Initial Stack:"+stack1);
		System.out.println("Popped elements:"+stack1.pop());
		System.out.println("Popped elements:"+stack1.pop());
		System.out.println("Stack after pop operation:"+stack1);

	}

}
