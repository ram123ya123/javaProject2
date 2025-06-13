package project1;
import java.util.HashMap;
public class Program65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,Integer> arr = new HashMap<>();
       arr.put("apples",20);
       arr.put("banana", 40);
       arr.put("apple",80);
       arr.remove("apples");
       System.out.println(arr);
       
	}

}
