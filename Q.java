// package pps;
interface P1{
	void area(int a, int b);
	
}
interface P2{
	double g=9.8;
	void value();
}
interface P12 extends P1,P2{
	
}
public class Q implements P12{
	public void area(int a, int b) {
		System.out.println("area of the rectangle is= "+ a*b);
	}
	public void value() {
		System.out.println("the valuye of G is= "+P12.g);
	}

	public static void main(String[] args) {
		Q a=new Q();
		a.area(5,8a);
		a.value();

	}

}






