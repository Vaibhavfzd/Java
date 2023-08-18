import java.awt.*;
import java.applet.*;
/*<applet code="Myapplet.java" width="300" height="400"></applet> */

public class Myapplet extends Applet{
    TextField t1,t2;
    public void init(){
        Label l1=new Label("Enter First Name");
        Label l2=new Label("Enter Second Name");
        t1=new TextField();
        t2=new TextField();
        Label b1=new Label("sum");
        setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        l2.setBounds(20, 100, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        b1.setBounds(20, 130, 30, 30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
    }
    public void paint(Graphics g){
        
        try{
            int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        String s=Integer.toString(c);
        g.drawString(s,150, 150);
    }
        catch(Exception e){}
        
        
    }
}





// /*<applet code="Myapplet.java" width="300" height="400"></applet> */
// public class Myapplet extends Applet
// {
// 		TextField t1, t2;
// 		public void init()
//         {
//                 t1 = new TextField(10);
//                 t2 = new TextField(10);

//                 add(t1);
//                 add(t2);

//                 t1.setText("0");
//                 t2.setText("0");
//         }
//         public void paint(Graphics g)
//         {
//                 int a=0,b=0,c=0;
//                 String str1,str2,str;

//                 g.drawString("Enter the number in each box",10,50);

//                 try
//                 {
//                         str1=t1.getText();
//                         a=Integer.parseInt(str1);

//                         str2=t2.getText();
//                         b=Integer.parseInt(str2);
//                 }
//                 catch(Exception e)
//                 {
//                 }
//                 c=a+b;

//                 str=String.valueOf(c);
            
//             }
// }                    