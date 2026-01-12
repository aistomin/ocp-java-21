public class TextBlocksDemo {
    public static void main(String [] args) {
	var block1 = """
	    hey
	""";
	var block2 = """
            hey
            """;
	System.out.println("Block 1: |%s|".formatted(block1));
	System.out.println("Block 2: |%s|".formatted(block2));
	// var block3 = """hey"""; - illegal text block open delimiter sequence, missing line terminator
    }
}

