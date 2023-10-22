package Quiz;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	DoubleSupplier ds;
	public static void main(String[] args) {
		Stream<String> cats = Stream.of("leopard", "lynx", "ocelet", "puma").parallel();
		Stream<String> bears = Stream.of("panda", "gryzzly", "polar").parallel();
		ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears).flatMap(s -> s)
				.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
		System.out.println(data.get(false).size() + " " + data.get(true).size());
		System.out.println(data.get(false) + " " + data.get(true));
		
		System.out.println(data);
	}
}
