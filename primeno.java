public class primeno {

    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]);
        int i, j,count=0;
        for(j=a+1;j<b;j++)
        {
            for(i=2;i<j;i++)
            {
                if(j%i==0)
                {break;}
            }
            if(i==j)
            {count++;}
        }
        System.out.println("Number of prime number between a and b is " +count);
    }
}
