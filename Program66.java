package project1;

public class Program66 {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
		for(int j =0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]);
			int temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp; 
		}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Program66 ob = new Program66();
        int a[] = {56,45,89,32};
        ob.bubbleSort(a);
        int n = a.length;
        for(int i =0;i<n;i++) {
        	System.out.println(a[i]+" ");
        	System.out.println();
        }
	}

}
