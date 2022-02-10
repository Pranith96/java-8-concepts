import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Accecpt: " + t);

	}

//	public void validation(String data) throws Exception {
//		if (data.length() < 10) {
//			throw new Exception("Length is low");
//		}
//	}

	public static void main(String[] args) {
		 ConsumerDemo consumerDemo = new ConsumerDemo();
		 consumerDemo.accept(10);

		Consumer<Integer> response = (t)-> {
			System.out.println("Accecpt: " + t);

		};

		Consumer<Integer> response1 = t -> {
			int i = t;
			System.out.println("Accecpt: " + i);
		};
		response1.accept(5);

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
		data.forEach(d -> System.out.println(d));

		String str = "LIC_REINST_QSTN";
		str = str.toLowerCase();
		System.out.println(str);
	}

}
