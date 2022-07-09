package Lists;
import java.util.Comparator;

public class Students implements Comparable<Students> {
	
	private String name;
	private int id;
	public Students(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return id + " " + name;
	}
	@Override
	public int compareTo(Students that) {
		return Integer.compare(this.id, that.id);
	}
}
