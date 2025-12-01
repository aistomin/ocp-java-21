public class ErrorsCorrectionWork {

    public static void main(String[] args) {
	// Question 1.
	Object skips = 10;
	System.out.println(skips.getClass() + ": " + skips);

	// Question 7.
	// for (int i = 0, int j = 9; i < 3; i++) { System.out.print(i); } - does not compile!
	for (int i = 0, j = 0; ++i < 10;) {
	    System.out.println(i);
	}

	// Question 12.
	int a = 3, b = 5, c = 10;
	a += 6 + b * c;
	System.out.println("a = " + a);

	int d = 1, e = 2, f = 3;	
	// d + f; does not compile!
	// d + e += f; does not compile!
    }
}

