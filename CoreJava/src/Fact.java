public class Fact {
	public int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		}
	public static void main(String[] args) {
		Fact f=new Fact();
	    System.out.println("Factorial of 5 is: "+f.fact(5));
	}

}
