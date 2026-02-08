public class UnicodeDemo {
    public static void main(String[] args) {
        char c = '😀'; // ❌ compilation error
        System.out.println("c = " + c);

        String s = "😀";
        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());

        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.codePointAt(0) = " + s.codePointAt(0));
        System.out.println("s.codePointCount(0, s.length()) = " + s.codePointCount(0, s.length()));

        var sb = new StringBuilder("Hello");
        sb.append(' ').appendCodePoint(128512);
        System.out.println("sb = " + sb);

        System.out.println("\"a\".codePointAt(0) = " + "a".codePointAt(0));
    }
}
