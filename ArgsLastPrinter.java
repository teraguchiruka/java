public class ArgsLastPrinter {
	public static void main(String[] args) {
	    for (int i = 0; i < 34; i++) {
		    System.out.println(i);
	        if (i % 3 == 0) {
	            System.out.println("Fizz");
	        }
	        else if (i % 5 == 0) {
	            System.out.println("Buzz");
	        }
	        else {
	            System.out.println("FizzBuzz");
	        }
	    }
	}
}
    
