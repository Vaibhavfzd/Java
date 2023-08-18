

public class XYZ extends Thread{
    public void Thread1(){   
        Thread.currentThread().setName("A");
        Thread.currentThread().setPriority(5);
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" - "+ i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    // public void Thread2(){
    //     Thread.currentThread().setName("B");
    //     Thread.currentThread().setPriority(10); 
    //     try{
    //         for(int i=1;i<=5;i++){
    //             System.out.println(Thread.currentThread().getName()+" - "+ i);
    //             Thread.sleep(1000);
    //         }
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
    // public void Thread3(){  
    //     Thread.currentThread().setName("C");
    //     Thread.currentThread().setPriority(1); 
    //     try{
    //         for(int i=1;i<=5;i++){
    //             System.out.println(Thread.currentThread().getName()+" - "+ i);
    //             Thread.sleep(1000);
    //         }
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }u
    
    
    public static void main(String args[]){
        XYZ a=new XYZ();
        a.Thread1();
    }
}
