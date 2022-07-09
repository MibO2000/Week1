package Week1.OOP.Encap;

public class Runner {
    public static void main(String[] args) {
        Base base = new Base();
        base.setAge(22);
        base.setIdNum("1");
        base.setName("Steve");
        System.out.println(base.getIdNum() + " " + base.getName() + " " + base.getAge());
    }
}
