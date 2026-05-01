import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
	var list = List.of("a", "b", "c");
	System.out.println(list);

	var arr1 = new String[5];
	var arr2 = list.toArray(arr1);
	System.out.println(arr1);
	System.out.println(arr2);
	System.out.println(arr1 == arr2);
	System.out.println(arr2.length);
	for (var s : arr2) {
	    System.out.println(s);
	}
    }
}

