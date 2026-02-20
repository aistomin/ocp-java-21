public class SuperConstrDemo {
    public static void main(String[] args) {
	var child = new Child(666);
	System.out.println("Name: " + child.name + "; " + child.age);
    }

    static class Parent {
	String name;
	Parent(String name) {
	    this.name = name;
	}
    }

    static class Child extends Parent {
	int age;
	Child() {
	    super("Child");
	    this.age = 0;
	}

	Child(int age) {
	    this(); // without this line it will fail miserably.
	    this.age = age;
	}
    }		
}

