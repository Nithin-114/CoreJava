package arrays;
public class Reverse {
	public static void main(String[] args) {
		int[] arr= {1,2,7,8,9,12,108,126 };
		System.out.println("Actual Array....");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("After Reversing......");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	}

