public class PlayingAround {
    public static void main(String arg[]) {
        var a = -5;
        var b = +a;
        System.out.println("b = " + b);

        System.out.println("x = y = 5");
        var x = 5;
        System.out.println("++x " + ++x);
        var y = 5;
        System.out.println("y++ " + y++);

        float f = 10;
        System.out.println("f = " + f);

        double d1 = 10;
        System.out.println("d1 = " + d1);

        double d2 = 100_000_000_000L;
        System.out.println("d2 = " + d2);

        short s1 = 32_000 + 700;
        System.out.println("s1 = " + s1);

        // short s2 = 32_000 + 800; - does not compile

        System.out.println("null == null = " + (null == null));

        // x == 5 ? System.sleep(1) : System.sleep(2); - does not compile
    }
}
