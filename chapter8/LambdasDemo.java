public class LambdasDemo {
    public static void main(String[] args) {
	Sammy sammy = (a, b, c) -> {
	    System.out.println("%s %s %d".formatted(a, b, c));
	    return 10;
	};
	var result = sammy.test("Hello", "world", 123);
	System.out.println("Result:  %d".formatted(result));
    }
}

interface Sammy {
    int test(String a, String b, int c);
}

interface ObjectMethods {
    // int toString(); - error: toString() in ObjectMethods cannot override toString() in Object ... return type int is not compatible with String
    String toString();
}

class MyClass {
    // public int toString(); - error: toString() in MyClass cannot override toString() in Object ... return type int is not compatible with String
}

