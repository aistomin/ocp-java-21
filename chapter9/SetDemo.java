import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	set.add(55);
	set.add(3);
	set.add(3);
	set.add(666);
	set.add(10);
	set.add(3);
	System.out.println(set);

	set = new LinkedHashSet<>();
        set.add(55);
        set.add(3);
        set.add(3);
        set.add(666);
        set.add(10);
        set.add(3);
        System.out.println(set);

        set = new TreeSet<>();
        set.add(55);
        set.add(3);
        set.add(3);
        set.add(666);
        set.add(10);
        set.add(3);
        System.out.println(set);

    }
}

