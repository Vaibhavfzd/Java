interface Arithmetic{
    void Sum(int a, int b);
    void Multiply(int a, int b);
    void Division(float a, float b);
    void Subtract(float a, float b);
}

class MatheMatics implements Arithmetic{

    public void Sum(int a, int b) {
        System.out.println(a+b);
    }

    public void Multiply(int a, int b) {
        System.out.println(a*b);
    }

    public void Division(float a, float b) {
        System.out.println(a/b);
    }

    public void Subtract(float a, float b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        MatheMatics m=new MatheMatics();
        m.Sum(5,5);
        m.Multiply(5,5);
        m.Division(5,5);
        m.Subtract(5,4);
    }
    
}