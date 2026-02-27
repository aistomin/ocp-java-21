public class SealedClassesDemo {

    // sealed class Parent permits Child, AnotherChild {}
    sealed class Parent {}

    non-sealed class Child extends Parent {}

    final class AnotherChild extends Parent {}

    public static void main(String[] args) {
	System.out.println("Sealed Classes Demo");
    }
}

