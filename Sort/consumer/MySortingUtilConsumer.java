package Week1.Sort.consumer;

import java.util.List;
import java.util.logging.Logger;

import Week1.Sort.sorting.utli.MySortingUtil;

public class MySortingUtilConsumer {
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Ravioli","Pasta","Spaghetti","Macaroni"));
		System.out.println(sorted.toString());
		logger.info(sorted.toString());
		
	}
}
	