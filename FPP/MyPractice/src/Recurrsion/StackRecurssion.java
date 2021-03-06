package Recurrsion;

import java.util.Stack;

public class StackRecurssion {
	
	public static void main(String[] args) {
		Stack<Integer> stackIntegers=new Stack<Integer>();
		for(int i=1;i<=5;++i) {
			stackIntegers.push(i);
		}
		System.out.println(stackIntegers.toString());
		reverseStack(stackIntegers);
		System.out.println(stackIntegers.toString());
		
	}
	
	public static void reverseStack(Stack<Integer> stack){
		if(stack.empty()) {
			return;
		}
		Integer popValInteger=stack.pop();
		reverseStack(stack);
		insertIntoStack(popValInteger, stack);
	}
	
	static void insertIntoStack(Integer val, Stack<Integer> stack) {
		if(stack.isEmpty()) {
			stack.push(val);
			return;
		}
		else {
			Integer tempInteger=stack.pop();
			insertIntoStack(val,stack);
			stack.push(tempInteger);
		}
	}
	
}
