import java.util.function.Supplier;

public class SupplierExample1 {
	static String name = "java";

	public static void main(String[] args) {

		Supplier<Integer> supplier1 = () -> name.length();
		Supplier<Boolean> supplier2 = () -> name.length() == 4;
		Supplier<String> supplier3 = () -> name.toUpperCase();
		System.out.println(supplier1.get());
		System.out.println(supplier2.get());
		System.out.println(supplier3.get());
	}
}