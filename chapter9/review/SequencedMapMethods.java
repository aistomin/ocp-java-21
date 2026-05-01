import java.util.TreeMap;
import java.util.Map;

public class SequencedMapMethods {
    public static void main(String ... args) {
	var map = new TreeMap<String, String>(Map.of(
	    "k1", "v1",
	    "k2", "v2",
	    "k3", "v3",
	    "k4", "v4",
	    "k5", "v5"
	));
	System.out.println(map);
	// map.putLast("k9", "v9"); - Exception in thread "main" java.lang.UnsupportedOperationException

	System.out.println(map.firstEntry());
	System.out.println(map.lastEntry());

	System.out.println(map.pollFirstEntry());
	System.out.println(map);
	System.out.println(map.pollLastEntry());
	System.out.println(map);
    }
}

