// STACK -----> LAST IN FIRST OUT

import java.util.*;
class stackDemo{
	public static void main(String[]args){
		Stack<String> demo = new Stack<>();
		demo.push("Lion");
		demo.push("Tiger");
		demo.push("Cat");
		demo.push("Horse");

		System.out.println("Items : "+demo);
		System.out.println("Peek : "+demo.peek());
		demo.pop();
		System.out.println("Peek : "+demo.peek());
	}
}
