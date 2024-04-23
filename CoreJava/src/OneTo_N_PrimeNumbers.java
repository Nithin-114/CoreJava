import java.util.Scanner;
public class OneTo_N_PrimeNumbers {
 public static void main(String[] args) 
 {
int i,j,count,n;
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Enter n Value :");
 n=sc.nextInt();
 System.out.println("Prime Numbers Between 1 to "+n+" are............");
for(j=2;j<=n;j++)
{
	count=0;
	for(i=1;i<=j;i++)
	{
	  if(j%i==0) 
	  {
		  count++;
	  }
	}
	if (count==2)
	{
		System.out.print(j+" ");
	}
}
	

}

}


