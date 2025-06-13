package project1;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Project51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> arr = new TreeSet<>() ; 
		arr.add("ramya");
		arr.add("kala");
		arr.add("nandhu");
		arr.add("pavan");
	    NavigableSet<String> s= arr.reversed(); 
		System.out.println(s);

		
		

	}

}
