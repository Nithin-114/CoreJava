package arrays;

import java.util.Scanner;

public class SearchElement2 {

	public static void main(String[] args) {
		int[] array= {20,52,17,21,19,15,8,5,26,44};
		int x=0;
		System.out.println("enter the element to be Searched");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
			for(int i=0;i<=array.length-1;i++)
			 { 
				if(array[i]==key) 
				{
				 System.out.println("Element Found At "+i+" Index");
				 x=1;
			    }
			 }
if(x==0) {
	System.out.println("Element Not Found!!!");
}
	
}
}
