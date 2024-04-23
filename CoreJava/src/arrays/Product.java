package arrays;
class Ddemo 
{
	public static void main(String[] args) 
	{
	int i=0,j=0,x=0;
	int[] arr={10,90,12,4,32,7};
	int y=arr[1];
	for (i=0;i<5;i=i+2)
	{
		x=x+arr[i];
    }
	for (j=1;j<=5;j=j+2)
	{   if (j==1)
		continue;
	    else
		y=y-arr[j];
    }
	System.out.println("Addition of Even Indexed Elements is: "+x);
	System.out.println("Subtraction of Odd Indexed Elements is: "+y);
	System.out.println("esult: "+x*y);
	}
}