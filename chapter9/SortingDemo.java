import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {
    public static void main(String[] args) {
	var list = new ArrayList<Product>();
	list.add(new Product("Tea"));
	list.add(new Product("Coffee"));
	list.add(new Product("Bisquit"));
	Collections.sort(list);
	System.out.println(list);

	list.sort(Comparator.reverseOrder());
        System.out.println(list);

	Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);

	var strings = List.of("Coffee", "Apple", "Tea");
	System.out.println(Collections.binarySearch(strings, "Tea", Comparator.naturalOrder()));

	var unsortable = new ArrayList<Garbage>();
	// Collections.sort(unsortable); -- error: no suitable method found for sort(ArrayList<Garbage>)

	var readonly = List.of(new Product("Beer"));
	// Collections.sort(readonly); - Exception in thread "main" java.lang.UnsupportedOperationException
	
	var records = new ArrayList<Rec>(List.of(
	    new Rec(10, "Ten2"), 
	    new Rec(2, "Two"),
	    new Rec(10, "Ten1") 
	));
	Collections.sort(records, Comparator.comparing(Rec::id).reversed().thenComparing(Rec::text));
	System.out.println(records);
    }


    static record Product(String name) implements Comparable<Product> {
	public int compareTo(Product p) {
	    return this.name.compareTo(p.name);
	}
    } 

    static record Garbage() {}

    static record Rec(int id, String text) {}
}

