public class MethodsOverloadingDemo {
    public static void main(String[] args) {
    	walk(new int[10]);
	walk(new Integer[5]);
	// walk1(new long[7]); -> argument mismatch; long[] cannot be converted to Long[]
        // walk2(new Long[7]); -> argument mismatch; Long[] cannot be converted to long[]
    }

    static void walk(int[] ints) {
	System.out.println("ints");
    }

    static void walk(Integer[] integers) {
        System.out.println("Integers");
    }	

    static void walk1(Long[] longs) {
        System.out.println("longs");
    }

    static void walk2(long[] longs) {
        System.out.println("Longs");
    }
}

