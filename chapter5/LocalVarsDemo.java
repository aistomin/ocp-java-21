public class LocalVarsDemo {
    public static void main(String[] args) {
	final int a;
	a = 5;
	System.out.println("a = " + a);

	final int b;
	// System.out.println("b = " + b); -> error: variable b might not have been initialized
    }
}

