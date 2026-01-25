public final class PatternMatchingDemo {
    public static void main(String[] args) {
        printIntegerGreaterThanFive((short)1);
        printIntegerGreaterThanFive(5);
        printIntegerGreaterThanFive(3L);
        printIntegerGreaterThanFive(4f);
        printIntegerGreaterThanFive(6);
        printIntegerGreaterThanFive(null);
        
        guardClauseTest(5, 1);
        guardClauseTest(5, -6);
        guardClauseTest("Hello!", 0);

	printMessage(10);
        printMessage(21.0f);
        printMessage(22.0);
    }

    private static void printIntegerGreaterThanFive(Number num) {
        if (num instanceof Integer i && i > 5) {
            System.out.println(i + " is greater than 5.");
        } else {
            System.out.println("Value: " + num + "(" + (num != null ? num.getClass() : null) + ")" + " is not an Integer or not strictly greater than 5.");
        }
    }

    private static void printMessage(final Number tickets) {
        if (tickets instanceof final Integer i) {
            System.out.println("Tickets sold: " + i);
        } else if (tickets instanceof final Float f) {
            System.out.println("Tickets credited: " + f);
        } else {
            throw new RuntimeException("The method is not implemented for: " + tickets  + " " + tickets.getClass());
        }
    }

    private static void guardClauseTest(Object o, int param) {
	if (o instanceof Integer i && param >= 0) {
	    System.out.println("Integer %d and positive %d".formatted(i, param));
        } else if (o instanceof Integer i && param < 0) {
            System.out.println("Integer %d and negative %d".formatted(i, param));
        } else {
	    System.out.println("'o' is not an integer: %s and param is %d".formatted(o, param));
        }
    }
}

