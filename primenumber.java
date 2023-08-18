class primenumber
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),i;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{System.out.println("Given number is not prime");
			  break;}
		}
		if(i==a)
		{System.out.println("Given number is prime");}
	}
}