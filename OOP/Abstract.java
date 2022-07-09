package Week1.OOP;

abstract class Shape{
    String name = " ";
    Shape (String name ){
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
    abstract public void scream();
    abstract public String ahh();
}

public class Abstract extends Shape{
    private int a,b;
    Abstract(int a, int b,String name){
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void scream() {
        System.out.println("ahhhhhhh");
    }
    @Override
    public String ahh() {
        return "zzzz";
    }

    public static void main(String[] args) {
        Abstract ab = new Abstract(1,2,"Hello");
        ab.print();
        System.out.println(ab.ahh());
        ab.scream();
    }
}
