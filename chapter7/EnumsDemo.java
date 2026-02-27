public class EnumsDemo {
    public static void main(String args[]) {
	System.out.println(Season.SUMMER);
	Season.SUMMER.doSomething();
	Season.WINTER.doSomething();
	Season.WINTER.stat();
    }
}

enum Season {
    WINTER {
	void doSomething() {
            System.out.println("Na, I'm sleeping!");
	    veryCustom();
	    stat();
        }

	static void stat() {
	    System.out.println("Winter static!");
	}

	void veryCustom() {
	    System.out.println("Winter custom!");
	} 
    },
    SPRING,
    SUMMER,
    FALL;

    void doSomething() {
	System.out.println("Doing something ....");
    }

    static void stat() {
        System.out.println("General static!");
    }	
} 
