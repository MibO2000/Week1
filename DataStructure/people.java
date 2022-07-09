package Week1.DataStructure;

public class people {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "person whose id is " + id +
                ", name is " + name+'.';
    }

    public people(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
