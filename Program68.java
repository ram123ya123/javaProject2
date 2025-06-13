package project1;
import java.util.Stack;
import java.util.Scanner;

public class Program68 {
	public static boolean isPalindrome(String str) {
		Stack<Character>stack = new Stack<>();
		for(int i =0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		String reversed = "";
		while (!stack.isEmpty()) {
			reversed + = stack.pop();
			}
		retuen str.equals(reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		String input = Scanner.nextLine();
		input = input.replaceAll

	}

}
