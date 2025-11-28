public class LoopsDemo {
    public static void main(String[] args) {
	int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
	O1: for (var i = 0; i < arr.length; i++) {
	    I: for (var j = 0; j < arr[i].length; j++) {
		if (arr[i][j] == 2) {
		    System.out.println("First 2 is at position (" + i + ", " + j + ").");
		    break O1;
		}
	    }
	}

	O2: for (var i = 0; i < arr.length; i++) {
            I: for (var j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 2) {
                    System.out.println("First 2 in row " + i + " is at position " + j + ".");
                    continue O2;
                }
            }
        }
    }
}

