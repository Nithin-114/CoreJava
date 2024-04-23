package arrays;
import java.util.Arrays;
public class SortedArray {
public static void main(String[] args)
{
	int[] arr= {7,2,12,8,9,1,108,126};
	System.out.println("elements before sorting..");
	for(int i:arr)
		System.out.print(i+" ");
	Arrays.sort(arr);
	System.out.println("\n");
	System.out.println("After Sorting......");
	for(int i:arr)
		System.out.print(i+" ");
}
}

