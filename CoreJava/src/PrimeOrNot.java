import java.util.Scanner;
public class PrimeOrNot {
 public static void main(String[] args) 
 {
 int i,count=0,n;
 @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
 System.out.println("Enter Number :");
  n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	  if(n%i==0) 
	  {
		  count++;
	  }
	}
	if (count==2)
		System.out.print(n+" is a Prime Number.");
	else
		System.out.println(n+" is Not prime Number");
 }
	

}

	