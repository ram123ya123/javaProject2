package project1;

import java.util.TreeSet;

public class Program36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers= new TreeSet<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(2);
		numbers.add(6);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(6));
		System.out.println(numbers.equals(numbers));

	}

}
