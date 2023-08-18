public class COverloading{
        int a, b;
        
        COverloading(int a, int b)
        {
            this.a=a;
            this.b=b;
            System.out.println(a+b);
        }
        COverloading(int a)
        {
            this.a=a;
            System.out.println(a);
        }

        public static void main(String args[]){
            COverloading p=new COverloading(3);
            COverloading s=new COverloading(3,5);
        }
}