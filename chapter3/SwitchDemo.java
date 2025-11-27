public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println(getAnimal(3));
        System.out.println(getAnimal(4));

        String str = "";
        switch(str) {}

        printAnimal(3);
        printAnimal(4);

        Boolean bool = true;
        switch(bool) { 
	    default: System.out.println("Default"); 
        }

        Long lng = 1L;
        switch(lng) {
            // case 1: System.out.println("1");
            default: System.out.println("Default");
        }

        System.out.println(yieldDemo(4));

	System.out.println(patternMatchingDemo(10));
	System.out.println(patternMatchingDemo(100));
        System.out.println(patternMatchingDemo(10L));
        System.out.println(patternMatchingDemo(10f));
	System.out.println(patternMatchingDemo(null));

	patternMatchingWithSwitchstatement(10);
	patternMatchingWithSwitchstatement(10.0);
	patternMatchingWithSwitchstatement(null);
    }

    private static String getAnimal(int type) {
        return switch(type) {
            default -> "Unknown";
	    case 1 -> "Lion";
	    case 2, 3 -> "Tiger";
            // default -> "Unknown";
	};
    }

    private static void printAnimal(int type) {
        switch(type) {
            case 1 -> System.out.println("Lion");
            case 2, 3 -> System.out.println("Tiger");
        }
    }

    private static String yieldDemo(int type) {
	return switch(type) {
            case 1 -> "Lion";
            case 2, 3 -> {
		System.out.println("Branch 2, 3");
		yield "Tiger";
	    }
            default -> {
                System.out.println("Default branch");
                yield "Unknown";
            }
        };
    }

    private static String patternMatchingDemo(Number n) {
	return switch(n) {
            case null -> "Value is null";
	    case Integer i when i < 100 -> "Small Integer " + i;
	    case Integer i -> "Big Integer " + i;
	    case Long l -> "Long " + l;
	    // case Integer i when i < 100 -> "Small Integer" + i;		 
	    default -> n.getClass() + " " + n;
	    // case null -> "Value is null";			
	};
    }

    private static void patternMatchingWithSwitchstatement(Number n) {
	switch (n) {
	    case Integer i: System.out.println("Integer " + i); break;
	    case null: System.out.println("null"); break;
	    case Number num: System.out.println(num.getClass() + " " + num);
	}
    }	
}

