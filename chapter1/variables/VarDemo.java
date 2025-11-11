public class VarDemo {

    // static class var { - at least this is not allowed.
    static class Var {
        int var = 10;
        void var() {
            var notVar = "not var";
            System.out.println("What a nonsense: " + var + " " + notVar);
        }
    }

    public static void main(String[] args) {
        var makeLoveNotVar = new Var();
        makeLoveNotVar.var(); 
    }
}
