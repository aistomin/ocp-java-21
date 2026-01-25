public class SwitchDemo2 {
    public static void main(String[] args) {
	int a = 5;
	int i = 0;
	switch (a) {
	    case 1 -> {
		i = 1;
		System.out.println(i);
	    }
	    case 2 -> {
                i = 2;
                System.out.println(i);
            }
	    case 5 -> {
                i = 5;
                System.out.println(i);
            }
	}

	var str = switch (i) {
	   case 1 -> "one";
	   case 2 -> "two";
	   default -> {
		System.out.println("Default case.");
		yield "Not one and not two";
	   }	
	};

	System.out.println("Test default case in the middle:");
	switch (a) {
	    case 1: System.out.println("one"); break;
	    case 2: System.out.println("to"); break;
	    default: System.out.println("no idea"); break;
	    case 5: System.out.println("five"); break;
	    case 6: System.out.println("six"); break;
	}
    }
}

