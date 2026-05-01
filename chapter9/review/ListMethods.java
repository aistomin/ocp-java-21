import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class ListMethods {
    public static void main(String ... args) {
	var list = Arrays.asList("one", "two", "three");
	System.out.println("List: " + list + "; class: " + list.getClass());
	// list.add("hundred"); - Exception in thread "main" java.lang.UnsupportedOperationException
	// list.remove("one"); - Exception in thread "main" java.lang.UnsupportedOperationException
	list.set(0, "set 0");
	System.out.println("List: " + list + "; class: " + list.getClass());

	list = List.of("four", "five");
	System.out.println("List: " + list + "; class: " + list.getClass());
	// list.add("hundred"); // - Exception in thread "main" java.lang.UnsupportedOperationException
	// list.remove("one"); // - Exception in thread "main" java.lang.UnsupportedOperationException
	// list.set(0, "set 0"); // - Exception in thread "main" java.lang.UnsupportedOperationException
	
	var set = Set.of("1", "4", "2", "5");
	list = List.copyOf(set);
	System.out.println("List: " + list + "; class: " + list.getClass());

	list = new ArrayList<String>();
	list.add("one");
	list.add(0, "one-0");
	// list.add(10, "one-10"); - Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 2
	System.out.println("List: " + list + "; class: " + list.getClass());

	System.out.println("IndexOf 'one': " + list.indexOf("one"));
	System.out.println("IndexOf 666: " + list.indexOf(666));

	System.out.println("List: " + list + "; class: " + list.getClass());
	list.set(0, "new one");
	System.out.println("List: " + list + "; class: " + list.getClass());
	list.remove("one");
	list.remove(0);
	System.out.println("List: " + list + "; class: " + list.getClass());
	// list.set(0, "new one"); - Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0

	var list1 = new ArrayList<StringBuilder>();
	list1.add(new StringBuilder("Tom"));
	list1.add(new StringBuilder("Alex"));
	list1.add(new StringBuilder("Gene"));
	list1.add(new StringBuilder("Paul"));
	list1.replaceAll(StringBuilder::reverse);
	System.out.println("List: " + list1 + "; class: " + list1.getClass());

	var arr1 = list1.toArray();
	System.out.println("Array length: " + arr1.length + "; class: " + arr1.getClass());
	
	var arr2 = list1.toArray(new StringBuilder[0]);
	System.out.println("Array length: " + arr2.length + "; class: " + arr2.getClass());

	var arr3 = new StringBuilder[4];
	var arr4 = list1.toArray(arr3);
	System.out.println("Array length: " + arr4.length + "; class: " + arr4.getClass() + "arr3 == arr4: " + (arr3 == arr4));
    
	var arr5 = new StringBuilder[10];
        var arr6 = list1.toArray(arr5);
        System.out.println("Array length: " + arr6.length + "; class: " + arr6.getClass() + "arr5 == arr6: " + (arr5 == arr6));

	var arr7 = new StringBuilder[3];
        var arr8 = list1.toArray(arr7);
        System.out.println("Array length: " + arr8.length + "; class: " + arr8.getClass() + "arr7 == arr8: " + (arr7 == arr8));
    }
}

