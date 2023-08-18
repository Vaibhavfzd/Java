class factorial
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),fact=1;
		while(a>0)
		{
			fact=fact*a;
			a--;
		}
		System.out.println("Factorialof given number is :"+fact);	
	}
}