import java.util.SequencedCollection;
import java.util.ArrayList;
import java.util.TreeSet;

public class SequencedCollectionsMethods {
    public static void main(String[] args) {
	SequencedCollection<String> collection = new ArrayList<String>();
	collection.addFirst("Tom");
	collection.addFirst("Dick");
	collection.addFirst("Harry");
	collection.addLast("Siegfried");
	System.out.println(collection);

	var reversed = collection.reversed();	
	System.out.println(reversed);

	System.out.println(collection.getFirst());
	System.out.println(collection.getLast());

	collection.removeFirst();
	System.out.println(collection);
	collection.removeLast();
	System.out.println(collection);

	var tree = new TreeSet<String>(reversed);
	System.out.println(tree);

	// tree.addFirst("Anatole"); - Exception in thread "main" java.lang.UnsupportedOperationException
	// tree.addFirst("Xenia"); - Exception in thread "main" java.lang.UnsupportedOperationException
    }
}

