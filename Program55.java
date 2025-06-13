package project1;
import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Program55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String[] names = {"alice","bunny","chinni","dunny","eliza"};
		System.out.println("enter the name for search:");
		String target = sc.nextLine();
		int result = binarySearch(names,target);
        if(result==-1) {
        	System.out.println("name not found.");
        }else {
        	System.out.println("name found at index"+result);
      }
	}

	public static int binarySearch(String[] names, String target) {
	     int left =0;
	     int right = names.length-1;
	     while(left<=right) {
	    	 int mid = left+right/2;
	    	 int comparsion = names[mid].compareTo(target);
	    	 if(comparsion==0) {
	    		 return mid;
	    	 }else if(comparsion<0) {
	    		  left = mid+1;
	    	 }
	    	 else {
                 right = mid -1;	    		 
	    	 }
	     }
		// TODO Auto-generated method stub
		
		return 0;
	}
}
