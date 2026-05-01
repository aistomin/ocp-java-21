import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class SortingData {
    public static void main(String[] args) {
	var persons = new ArrayList<Person>(List.of(
	    new Person("Alex", 21),
	    new Person("Siegfried", 100),
	    new Person("Tom", 20),
	    new Person("Alex", 25),
	    new Person("Bob", 30),
	    new Person("Tom", 19),
	    new Person("Bob", 33)
	));
	System.out.println(persons);

	Comparator<Person> c1 = Comparator.comparing(Person::name);
	persons.sort(c1);
	System.out.println(persons);

	Comparator<Person> c2 = Comparator.comparingInt(Person::age).reversed();
	persons.sort(c2);
	System.out.println(persons);

	persons.sort(c1.thenComparing(c2));
	System.out.println(persons);
	

	persons.sort(c1);
	System.out.println(persons);

	var index = Collections.binarySearch(persons, new Person("Siegfried", 0), c1);
	System.out.println("Siegfried: " + index);
    }

    static record Person(String name, int age) {
	
    }	
}

