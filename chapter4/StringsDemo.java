public class StringsDemo {
    public static void main(String[] args) {
	var str = "Hello World!";
	str += "!!";
	System.out.println(str);

	// str *= 3; - does not compile!
	// str -= "!"; - does not compile
	// str /= 3; - does not compile
        System.out.println(str);
	
	var asciiStr = "abc";
        System.out.println("asciiStr.length() = " + asciiStr.length());

	var unicodeStr = "ab😊";
	System.out.println("unicodeStr = " + unicodeStr);
	System.out.println("unicodeStr.length() = " + unicodeStr.length());
	
	System.out.println("unicodeStr.charAt(0) " + unicodeStr.charAt(0));
	System.out.println("unicodeStr.codePointAt(0) " + unicodeStr.codePointAt(0));

	System.out.println("unicodeStr.charAt(1) " +  unicodeStr.charAt(1));
        System.out.println("unicodeStr.codePointAt(1) " + unicodeStr.codePointAt(1));

	System.out.println("unicodeStr.charAt(2) " + unicodeStr.charAt(2));
        System.out.println("unicodeStr.codePointAt(2) " + unicodeStr.codePointAt(2));

	System.out.println("unicodeStr.charAt(3) " + unicodeStr.charAt(3));
        System.out.println("unicodeStr.codePointAt(3) " + unicodeStr.codePointAt(3));

	// System.out.println("unicodeStr.charAt(4) " +  unicodeStr.charAt(4)); - error in runtime: StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // System.out.println("unicodeStr.codePointAt(4) " + unicodeStr.codePointAt(4)); - error in runtime: StringIndexOutOfBoundsException: Index 4 out of bounds for length 4

	char[] charArray = { unicodeStr.charAt(2), unicodeStr.charAt(3) };
	var emoji = new String(charArray);
	System.out.println("emoji = " + emoji);
    }
}

