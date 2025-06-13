package project1;
 class Lion{
	 void run() {
		 System.out.println("it is the king of the forest");
	 }
	
}
 class Giraffe extends Lion{
	 void run() {
		 System.out.println("it is the tallest element");
	 }
 }

public class Project41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giraffe s= new Giraffe();
		Lion g = new Lion();
          g.run();		
          s.run();
	}

}
