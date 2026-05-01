import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CommonCollectionAPIs {
    public static void main(String[] args) {
	Consumer<Object> out = (p) -> {
	     System.out.println(p);
	};

	Collection<String> list = new ArrayList<>();
	out.accept(list);
	
	list.add("Sparrow");
	
	out.accept(list);
	out.accept(list.size());
	out.accept(list.isEmpty());

	list.remove(Integer.valueOf(10));
	list.remove("Spar" + new String("row"));
	out.accept(list);
	out.accept(list.size());
	out.accept(list.isEmpty());

	list.add("Line1_1");
	list.add("Line1_2");
	list.add("Line1_3");
	list.add("Line2_1");
	list.add("Line2_1");
	list.add("Line2_1");

	out.accept(list);
	out.accept(list.contains("Line1_2"));
	out.accept(list.contains("Line3_2"));

	list.removeIf(s -> s.startsWith("Line1"));
	out.accept(list);
	list.forEach(out);

	list.clear();
	out.accept(list);

	list.remove(10);
	list.contains(10);
    }
}

