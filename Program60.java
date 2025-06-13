package project1;

public class Program60 {
       static String add(String x,String y) {
    	   int num1 = Integer.parseInt(x,2);
    	   int num2 = Integer.parseInt(y,2);
    	   int sum = num1+num2;
    	   String result = Integer.toBinaryString(sum);
    	   return result;
    	   
       }
	public static void main(String[] args) {
		String x ="10110"; 
		String y = "11110";
		System.out.println("the addition of:"+add(x,y));
		// TODO Auto-generated method stub
	

	}

}
