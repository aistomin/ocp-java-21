public class CompoundOperatorDemo {
    public static final void main(final String args[]) {
        int i = 0;
        i += 10L;
        System.out.println("i = " + i);

        long l = 10_000_000_000L;
        i += l;
        System.out.println("i = " + i);

        i = 0 ;
        i += 10.8;
        System.out.println("i = " + i);

        i -= 10.8f;
        System.out.println("i = " + i);
    }
}

