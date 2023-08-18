class max
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c=Integer.parseInt(args[2]);
		if(a>b && a>c)
		{System.out.println(" a is largest number with value="+a);}
		if(b>a && b>c)
		{System.out.println(" b is largest number with value="+b);}
		if(c>b && c>a)
		{System.out.println(" c is largest number with value="+c);}
	}
}