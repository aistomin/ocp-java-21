class A {
    private void m2() {
	// new B().m1(); - error: m1() has private access in B
    }
    
    class C {
        void m3() {
	    new A().m2();
        }
    }
}

class B {
    private void m1() {
    }
}
