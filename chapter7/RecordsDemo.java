public class RecordsDemo {
    public static void main(String[] args) {
	Person simple = new SimplePerson("Andrej", 40);
	System.out.println(simple);

	Person validated = new ValidatedPerson("   Andrej", "Istomin   ", 40);
	System.out.println(validated);

	System.out.println("Are persons equal: " + (simple.equals(validated)));

	Person duplicate = new ValidatedPerson("Andrej", 40);
	System.out.println("Is person equal to the duplicate: " + (duplicate.equals(validated)));
	System.out.println("Is person == to the duplicate: " + (duplicate == validated));

	var complex = new ComplexPerson("Jenny", 20, new SimplePerson("Bob", 25));
	System.out.println(complex);

        System.out.println("Switch demo 1: " + switchDemo(simple));
	System.out.println("Switch demo 2: " + switchDemo(complex));
	System.out.println("Switch demo 2: " + switchDemo(validated));
    }

    static String switchDemo(Person p) {
	return switch (p) {
	    case SimplePerson(Object obj, int i) -> "%s(%d)".formatted(obj, i);
	    case ComplexPerson(String name, int age, SimplePerson(String partnerName, int partnerAge)) -> "Complex person %s (%d) has a simple partner %s(%d)".formatted(name, age, partnerName, partnerAge);
	    case Person person -> "No idea what it is: %s".formatted(person);
	};
    }
}

interface Person {
    int age();
}

record SimplePerson(String name, int age) implements Person {}

record ValidatedPerson(String name, int age) implements Person {
    ValidatedPerson {
	if (name == null || name.isBlank()) {
	    throw new IllegalArgumentException("The name is not provided");
	}
	name = name.strip();
    }

    ValidatedPerson(String firstName, String lastName, int age) {
	this("%s %s".formatted(firstName, lastName), age);
    }
}

record ComplexPerson(String name, int age, Person partner) implements Person {}

