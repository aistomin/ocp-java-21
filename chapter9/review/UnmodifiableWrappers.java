import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;

public class UnmodifiableWrappers {
    public static void main(String ... args) {
	Consumer<Object> o = (obj) -> {
	    System.out.println(obj + "|" + obj.getClass());
	};

	o.accept(Collections.unmodifiableCollection(new ArrayList<String>()));
	o.accept(Collections.unmodifiableList(new ArrayList<String>()));
	o.accept(Collections.unmodifiableSet(new HashSet<String>()));
	o.accept(Collections.unmodifiableMap(new HashMap<String, String>()));
	
	var list = new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("one");
	// o.accept(Collections.unmodifiableSet(list)); - ArrayList<String> cannot be converted to Set<? extends T>
    }
}

