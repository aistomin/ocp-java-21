public class LiteralsAndUnderscoreDemo {
    
    public static void main(String[] args) {
        //  int i = _1; - wrong!
        //  int i = 1_; - wrong!
        int i = 1_____________________________________0;
        System.out.println("i: " + i);
        // double d = 1_.0; - wrong!
        // double d = 1._0; - wrong!
        // double d = 1.0_; - wrong!
        double d = 1____________2.3_______________4;
        System.out.println("d: " + d);
    }
}

