import java.util.function.Consumer;
import java.util.Map;
import java.util.HashMap;

public class MapMethods {
    public static void main(String[] args) {
	Consumer<Object> out = (obj) -> {
	    System.out.println(obj + "|" + obj.getClass());
	};

	var mapof = Map.of(
	    "keyA", "valueA", 
	    "keyB", "valueB", 
	    "keyC", "valueC"
	);
	out.accept(mapof);

	var mapofentries = Map.ofEntries(
	    Map.entry("key1", "val1"),
	    Map.entry("key2", "val2"),
	    Map.entry("key3", "val3")
	);
	out.accept(mapofentries);

	var map = new HashMap<String, String>();
	map.putIfAbsent("name1", "Alex");
	map.putIfAbsent("name1", "Alex-overwritten");
	map.putIfAbsent("name2", "Bob");
	map.putIfAbsent("name2", "Bob-overwritten");
	out.accept(map);

	out.accept(map.containsKey("name1"));
	out.accept(map.containsKey("name3"));

	out.accept(map.containsValue("Alex"));
	out.accept(map.containsValue("Siegfried"));

	map.forEach((k, v) -> {
	    System.out.println("%s:%s".formatted(k, v));
	});
	
	out.accept(map.getOrDefault("name1", "not found"));
	out.accept(map.getOrDefault(1, "not found"));

	map.clear();
	out.accept(map);
    }
}

