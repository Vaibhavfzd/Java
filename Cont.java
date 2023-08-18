import java.util.*;
public class Cont
{
    static void Sum(int a, int b)
    {
            System.out.println(a+b);
    }    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        Sum(a,b);
    }
}
