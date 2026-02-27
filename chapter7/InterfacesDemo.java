public class InterfacesDemo implements A, B {
    public String name() {
	return "Demo";
    }

    public static void main(String[] args) {
	var str = new InterfacesDemo().name();
	System.out.println(str);

	var d = new D();
	d.testGo();
	d.testStop();
    }
}

interface A {
    CharSequence name();
}

interface B {
    Object name();
}

class C {
    static void go() {
	System.out.println("C.go");   
    }
}

interface IC {
    static void stop() {
	System.out.println("IC.stop");
    }
}

class D extends C {
    void testGo() {
	go();
    }

    void testStop() {
        IC.stop();
    }
}

