import java.util.function.Consumer;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
	Consumer<Object> out = (p) -> {
	    System.out.println(p + "; " + p.getClass());
	};
	var letters = Set.of('c', 'a', 't');
	out.accept(letters);
	var copy = Set.copyOf(letters);
	out.accept(copy);
    }
}

