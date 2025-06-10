package project1;
import java.util.Queue;
import java.util.LinkedList;
public class Prgram39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> arr = new LinkedList<String>();
		arr.add("ramya");
		arr.add("manoj");
		arr.add("umesh");
		String firstOut=arr.remove();
		System.out.println(firstOut);
		System.out.println(arr);
		

	}

}
