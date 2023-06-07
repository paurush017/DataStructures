public class KeypadCombination {
	
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
	
	public static String[] keypad(int n) {
		
		if(n==0) {
			String [] ans = {""};
			return ans;
		}
		
		int lastDigit = n%10;
		int smallerNumber = n/10;
		
		String[] smallAns = keypad(smallerNumber);
		char[] options = numberOptions(lastDigit);
		String[] ans = new String[smallAns.length*options.length];
		int k=0;
		
		for(int i=0; i<smallAns.length; i++) {
			for(int j=0; j<options.length; j++) {
				ans[k]=smallAns[i]+options[j];
				k++;
			}
		}
		return ans;
	}

}
