package project1;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the type of running(Yes/No)");
		String water = sc.next();
		if(water==("yes")) {
          System.out.println("israining");		
		}else {
			System.out.println("notisrainng");
		}
	}

}
