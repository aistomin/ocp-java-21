import java.util.function.*;

public class BuiltInFunctionalInterfacesDemo {
    public static void main(String[] args) {
	System.out.println(testSupplier(() -> "Check that supplier works!"));
	testConsumer(s -> System.out.println("1: %s".formatted(s)), s -> System.out.println("2: %s".formatted(s)));
	System.out.println("Test predicates 1: " + testPredicates(s -> s.startsWith("Hello"), String::isEmpty));
	var greeting = "Hello World!!!";
	System.out.println("Test predicates 1: " + testPredicates(s -> s.startsWith("Hello"), greeting::equals));
	System.out.println(testFunction((var i) -> i * i, (Integer a) -> "Square: %d".formatted(a)));
    }

    static String testSupplier(java.util.function.Supplier<String> supplier) {
	return supplier.get();
    }

    static void testConsumer(java.util.function.Consumer<String> consumer1, java.util.function.Consumer<String> consumer2) {
	consumer1.andThen(consumer2).accept("Check that consumer works!");
    }

    static Boolean testPredicates(Predicate<String> p1, Predicate<String> p2) {
	return p1.and(p2.negate()).test("Hello World!!!");
    }

    static String testFunction(Function<Integer, Integer> calc, Function<Integer, String> out) {
	// return out.compose(calc).apply(2);
	return calc.andThen(out).apply(2);
    }
}

