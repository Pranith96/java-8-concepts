import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo { /*
								 * implements Predicate<Integer> {
								 * 
								 * public boolean test(Integer t) { if (t % 2 == 0) { return true; } return
								 * false; }
								 */

	public static void main(String[] args) {

		/*
		 * PredicateDemo predicateDemo = new PredicateDemo(); boolean response =
		 * predicateDemo.test(4);
		 * 
		 * System.out.println(response);
		 */

		Predicate<Integer> data = (t) -> {
			if (t % 2 == 0) {
				return true;
			}
			return false;
		};

		Predicate<Integer> response = t -> t % 2 == 0;
		response.test(6);
	}

//	public void data() {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//		list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
//	}

}
