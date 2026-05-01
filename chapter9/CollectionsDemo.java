import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
	var objects = new ArrayList<>();
	objects.add("Hello");
	objects.add(666);
	System.out.println(objects);

	Collection<String> strColl = new ArrayList<>();
	System.out.println(strColl.add("Hello"));
	System.out.println(strColl.add("Hello"));
	System.out.println(strColl);

	strColl = new HashSet<>();
        System.out.println(strColl.add("Hello"));
        System.out.println(strColl.add("Hello"));
        System.out.println(strColl);

	strColl = new ArrayList<>();
	strColl.add("one");
	strColl.add("one");
	System.out.println(strColl.remove(10));
	System.out.println(strColl.remove("one"));
	System.out.println(strColl);

	System.out.println(strColl.contains(10));
	System.out.println(strColl.contains("one"));

	strColl.add("");
	strColl.add("    ");
        strColl.add(" ");
	System.out.println(strColl);
	System.out.println(strColl.removeIf(String::isEmpty));
	System.out.println(strColl);
	System.out.println(strColl.removeIf(String::isBlank));
        System.out.println(strColl);

	var list = new ArrayList<String>();
	list.add("two");
	list.add("three");
	list.forEach(s -> System.out.println("%d. %s".formatted(list.indexOf(s), s)));
    }
}

