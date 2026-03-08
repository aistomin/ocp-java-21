import java.util.function.*;

public class FunctionalInterfacesForPrimitivesDemo {
    public static void main(String[] args) {
	BooleanSupplier bs = () -> 20 > 5;
	System.out.println("BooleanSupplier: " + bs.getAsBoolean());

	DoubleSupplier ds = () -> 28.5;
	System.out.println("DoubleSupplier: " + ds.getAsDouble());

	IntConsumer ic = i -> System.out.println("IntConsumer: " + i);
	ic.accept(666);

	LongConsumer lc = l -> System.out.println("LongConsumer: " + l);
	lc.accept(777);

	DoublePredicate dp = (double d) -> d > 10;
	System.out.println("DoublePredicate: " + dp.test(666.6));

	IntFunction<Integer> ifn = i -> Integer.valueOf(i);
	System.out.println("IntFunction: " + ifn.apply(1).getClass());
    }
}

