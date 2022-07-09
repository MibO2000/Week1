package Week1.OOP;

class Animal {
    private String name;
    private int age;
    Animal(){}
    Animal (String name){
        this.name = name;
    }
    Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void bark (){
        System.out.println("oof");
    }
}
public class OverridingOverloading extends Animal{
    OverridingOverloading(String name, int age) {
        super(name, age);
    }
    OverridingOverloading(String name) {
        super(name);
    }
    OverridingOverloading() {
    }
    @Override
    public void bark() {
        super.bark();
        System.out.println("meow");
    }
    public static void main(String[] args) {
        OverridingOverloading demo = new OverridingOverloading("dog",2);
        Animal animal = new Animal();
        animal.bark();
        demo.bark();
    }
}
