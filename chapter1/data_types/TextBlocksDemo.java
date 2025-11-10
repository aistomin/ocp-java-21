public class TextBlocksDemo {
    
    public static void main(String[] args) {
        // String block = """block"""; // - wrong
        String block = """
""";
        System.out.println(block);

        // String block2 = """
        //    Hello!!!
        //    This does not work: """
        //    Bye! 
        //""";
        String block2 = """
            Hello, \
            user!
            This must \
            work!!! \n
            Bye!""";  
        System.out.println(block2);
    }
}

