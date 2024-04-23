import java.util.Scanner;
public class Pallindrome {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number : ");
	int num=sc.nextInt();
	int rev=0,temp=num;
	while(num!=0)
	{
	   int rem=num%10;
	   rev=(rev*10)+rem;
	   num=num/10;
	 }
	if(rev==temp)
		System.out.println(temp+" is Pallindrome Number");
	else
		System.out.println(temp+ " is Not a Pallindrome Number ");
}
}


