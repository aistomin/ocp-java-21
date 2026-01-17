public class InstanceofDemo {
    public static void main(String[] args) {
	// System.out.println(9 instanceof Integer); -- error: unexpected type
	int a = 9;
	// System.out.println(a instanceof Integer); -- error: unexpected type
	Integer b = a;
	System.out.println(b instanceof Integer);
    }
}

