public class TextBlocksDemo {

    public static void main(String[] args) {
        var str = "Hello!";
        System.out.println("str = " + str.length());
        var block = """
        Hello!""";
        System.out.println("block = " + block.length());
    }
}