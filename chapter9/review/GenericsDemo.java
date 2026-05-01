import java.util.List;
import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String ... args) {
	var g = new Gen<String>();
	g.print("Hello World!!!");
	g.<Integer>printStaticGen(666);

	var list = new ArrayList<String>();
	list.add("One");
	list.add("Two");
	list.add("Three");
	// printObjects(list); -- reason: argument mismatch; ArrayList<String> cannot be converted to List<Object>
	printUnbounded(list);

	// List<CharSequence> strings = new ArrayList<String>(list); -- error: incompatible types: ArrayList<String> cannot be converted to List<CharSequence>
	List<? extends CharSequence> strings  = new ArrayList<String>(list);
	// strings.add("Four"); -- error: no suitable method found for add(String)
	strings.remove(0);
	printUnbounded(strings);
    }

    static void printObjects(List<Object> list) {
        for (var x: list) {
            System.out.println(x);
        }
    }

    static void printUnbounded(List<?> list) {
	for (var x: list) {
	    System.out.println(x);
	}
    }

    static class Gen<T> {
	void print(T t) {
	    System.out.println("Class T: " + t);
	}

	void over(List<Integer> i) {}
	
	// void over(List<Double> d) {} -- error: name clash: over(List<Double>) and over(List<Integer>) have the same erasure 

	static <T> void printStaticGen(T t) {
	    System.out.println("Static T: " + t);
	}

	// T construct1() { return new T(); } -- GenericsDemo.java:23: error: unexpected type 

	// T[] construct2() { return new T[10]; } // GenericsDemo.java:25: error: generic array creation 
	
	// boolean check(Object obj) { return obj instanceof T; } -- GenericsDemo.java:27: error: Object cannot be safely cast toT 	    
    }
}

