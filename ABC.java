 

class A extends Thread
{
    public void run()
    {   
        for(int i=0;i<=20;i++){
        System.out.println("A"+i);}
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=0;j<=20;j++){
            System.out.println("B"+j);}
    }
}
class C extends Thread
{
    public void run(){
        for(int k=0;k<=20;k++){
            System.out.println("C"+k);}
    }
}

class ABC{
    public static void main(String args[]){
       A obj1=new A();
       B obj2=new B();
       C obj3=new C();
       obj1.start();
       obj2.start();
       obj3.start();   
        
    }

}