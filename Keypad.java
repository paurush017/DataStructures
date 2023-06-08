public class Keypad {
	
	public static char[] numberOptions(int n) {
		
		switch(n) {
		
		case 2:
			char[] options2 = {'a','b','c'};
			return options2;
		
		case 3:
			char[] options3 = {'d','e','f'};
			return options3;
			
		case 4:
			char[] options4 = {'g','h','i'};
			return options4;
			
		case 5:
			char[] options5 = {'w','x','y','z'};
			return options5;
			
		default :
			char[] ans = {'0'};
			return ans;

		}
		
	}
	
	public static void printKeypad(int n) {
		printKeypad(n,"");
	}

	public static void printKeypad(int n, String outputSoFar) {
		
		if(n==0) {
			System.out.println(outputSoFar);
			return;
		}
		
		int lastDigit = n%10;
		char[] options = numberOptions(lastDigit);
		
		for(int i=0; i<options.length; i++) {
			printKeypad(n/10, outputSoFar + options[i]);
		}
		
	}
	
}
