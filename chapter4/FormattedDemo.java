public class FormattedDemo {
    public static void main(String[] args) {
	var pi = 3.14159265359;

	System.out.format("[%f]", pi);
	System.out.println("[%f]".formatted(pi));

	System.out.format("[%12.8f]", pi);
        System.out.println("[%12.8f]".formatted(pi));

	System.out.format("[%012.8f]", pi);
        System.out.println("[%012.8f]".formatted(pi));

	System.out.format("[%06.2f]", pi);
        System.out.println("[%06.2f]".formatted(pi));

	System.out.format("[%02.2f]", pi);
        System.out.println("[%02.2f]".formatted(pi));

	System.out.format("[%.3f]", pi);
        System.out.println("[%.3f]".formatted(pi));
    }
}
