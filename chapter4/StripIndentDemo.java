public class TextBlocksDemo {

    public static void main(String[] args) {
        var text = """
            Hello!
              My name is Andrej""";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.indent(-2) = " + text.indent(-2));
        System.out.println("text.indent(-2).length() = " + text.indent(-2).length());

        System.out.println("----------------------------");
        System.out.println(text);
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        System.out.println(text.indent(-1));
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        System.out.println(text.stripIndent());
        System.out.println("----------------------------");
    }
}