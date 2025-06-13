package project1;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int m = 0;
		try {
			   int ans = n / m;
			   System.out.println("Answer:+ans");
		}
		catch(ArithmeticException e) {
			System.out.println("error:division by zero");
		}
		finally {
			System.out.println("program continues after handling the exception");
		}

	}

}
