public class MethodReferencesDemo {
    public static void main(String[] args) {
	Printy printy = System.out::println;
	printy.printIt("Hello!!!");

	String format = "%s, %d!!!";
	Formatty formatty = format::formatted;
	printy.printIt(formatty.formatIt("Hello", 10));

	FormattyFlexibly flexy = String::formatted;
	printy.printIt(flexy.formatIt("Hello, %s!!!", "Andrej"));

	Creaty creaty = Dummy::new;
	for (int i = 0; i < 10; i++) {
	    Dummy dummy = creaty.createDummy("Dummy #%d".formatted(i));
	    printy.printIt(dummy.name);
	}
    }
}

interface Printy {
    void printIt(String str);
}

interface Formatty {
    String formatIt(Object... objects);
}

interface FormattyFlexibly {
    String formatIt(String format, Object ... objects);
}

interface Creaty {
    Dummy createDummy(String name);
}

class Dummy {
    String name;

    Dummy(String n) {
	name = n;
    }
}

