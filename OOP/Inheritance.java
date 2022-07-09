package Week1.OOP;

class Calculation{
    int z;
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The Sum is: "+z);
    }
    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The Difference is: "+z);
    }
}

public class Inheritance extends Calculation{
    public void multiplication (int x, int y){
        z = x * y;
        System.out.println("The Multiplication is: "+z);
    }

    @Override
    public void addition(int x, int y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        int a = 100, b = 20;
        Inheritance demo = new Inheritance();
        Calculation cal = new Calculation();
        cal.addition(a,b);
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
    }
}
