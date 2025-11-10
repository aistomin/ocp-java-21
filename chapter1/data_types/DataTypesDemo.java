public class DataTypesDemo {
    
    public static void main(String[] args) {
        int i = 2_100_000_000;
        System.out.println("Integer example: " + i);
        long l = 123;
        // l = 3_000_000_000; - Doesn't compile as 3bn > 2,1bn that integer allows
        l = 3_000_000_000L;
        System.out.println("Long example: " + l);
        char ch = '😊';
        System.out.println("Chat example: " + ch);
    }
}

