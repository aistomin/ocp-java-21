import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapDemo {
    public static void main(String[] args) {
	var map = new HashMap<String, String>();
	print(fill(map));
	print(fill(new LinkedHashMap<String, String>()));
	print(fill(new TreeMap<String, String>()));

	BiFunction<String, String, String> mrg = (old, val) -> { 
	    System.out.println("Merge function was called");
	    if ("deleteme".equals(val)) return null;
	    return old.length() > val.length() ? old : val;
	};
	
	map.merge("manager", "Alice Smith", mrg);
	System.out.println(map);

 	map.merge("electrician", "Robbie", mrg);
	System.out.println(map);

	map.merge("programmer", "deleteme", mrg);
	System.out.println(map);

    }

    static Map<String, String> fill(Map<String, String> map) {
	map.put("manager", "Alice");
	map.put("programmer", "Bob");
	map.put("accountant", "Tom");
	return map;
    }

    static void print(Map<String, String> map) {
	System.out.println("Class: %s; Content: %s".formatted(map.getClass(), map));
    }
}

