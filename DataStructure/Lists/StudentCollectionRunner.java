package Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DesComparator implements Comparator<Students>{
	public int compare(Students student1, Students student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}

public class StudentCollectionRunner {
	public static void main(String[] args) {
		 List<Students> students = List.of(new Students("Adam",2),
				 new Students("Eve",1), new Students("Raj",9));
		 List<Students> studentsAl = new ArrayList(students);
		 System.out.println(studentsAl);
		 Collections.sort(studentsAl);
		 System.out.println(studentsAl);
		 Collections.sort(studentsAl,new DesComparator());
		 System.out.println(studentsAl);
		 studentsAl.sort(new DesComparator());
		 System.out.println(studentsAl);

	}

}
