import java.util.function.Predicate;

public class PredicateDemo { /* implements Predicate<Integer> {

	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		}
		return false;
	}*/

	public static void main(String[] args) {

		//PredicateDemo predicateDemo = new PredicateDemo();
		//boolean response = predicateDemo.test(4);

		//System.out.println(response);

		// 1st
		Predicate<Integer> data = (t) -> {
			if (t % 2 == 0) {
				return true;
			}
			return false;
		};

		//2nd
		Predicate<Integer> response2 = t -> t % 2 == 0;
		response2.test(6);
	}

//	public void data() {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//		list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
//	}

}
