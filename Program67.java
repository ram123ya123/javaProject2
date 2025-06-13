package project1;
import java.util.Scanner;

public class Program67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int [] arr = new int[5];
          System.out.println("enetr the five numbers");
          for(int i=0;i<5;i++){
        	 arr[i] = sc.nextInt();
          }
          int max = arr[0];
          for(int i =0;i<arr.length;i++) {
        	  if(arr[i]>max) {
        		  max = arr[i];
        	  }
          }
          System.out.println("the biggest number:"+max);
          
	}

}
