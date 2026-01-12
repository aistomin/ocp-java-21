public class VariableNamesDemo {
    public static void main(String [] args) {
	var __ = "Hello";
	System.out.println(__);
	Object o;
	// System.out.println(o); - error: variable o might not have been initialized
	// var a = null; - error: cannot infer type for local variable a
	var a = (Object) null;
    }
}

