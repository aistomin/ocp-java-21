import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int a, b[], c[][];
        a = 1;
        b = new int[10];
        c = new int[10][10];
        System.out.println("a = " + a);
        
	for (int i = 0; i < b.length; ) {
	    b[i] = ++i;
	}
	System.out.println(Arrays.toString(b));

	var k = 0;
	for (int i = c.length - 1; i >= 0; i--) {
	    var row = c[i];
	    for (int j = row.length - 1; j >= 0; j--) {
		c[i][j] = ++k; 
            }
	}
	for (var row : c) {
	    for (int i : row) {
		System.out.print("(%d)".formatted(i));
	    }
	    System.out.println();
	}
    }
}
