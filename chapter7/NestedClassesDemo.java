public class NestedClassesDemo {
    public static void main(String[] args) {
	var demo = new NestedClassesDemo();
	var simple = demo.new InnerSimple();
	System.out.println(simple);

	var nested = demo.new NestedInnerClass().new NestedInnerClass2ndGrade();
	System.out.println(nested);

	class LocalDemo implements StaticInterface1, StaticInterface2 {
	    @Override
            public String toString() {
                return "Local demo class";
            }
	}

	System.out.println(new LocalDemo());
    }

    static interface StaticInterface1 {}

    static interface StaticInterface2 {}

    class InnerSimple {
	@Override
	public String toString() {
	    return "I'm a simple inner class";
	}
    }

    class NestedInnerClass {

	@Override
        public String toString() {
            return "Nested inner class";
        }

	class NestedInnerClass2ndGrade {
	    @Override
            public String toString() {
                return "I'm a nested inner class second grade, my parent: %s".formatted(NestedInnerClass.this.toString());
            }
	}
    }
}

