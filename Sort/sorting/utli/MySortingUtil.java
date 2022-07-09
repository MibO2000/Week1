package Week1.Sort.sorting.utli;

import java.util.List;

import Week1.Sort.sorting.algorithm.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names){
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
	
}
