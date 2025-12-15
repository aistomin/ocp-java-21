public class StringBuilderDemo {
    public static void main(String[] args) {
	var sb = new StringBuilder(5);
	sb.append("abcde").append("12345");
	System.out.println("|" + sb + "|");
    }
}
