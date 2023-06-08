public class CheckAB {
	
	public static boolean check(String input) {
		if(input.length()==0) {
			return true;
		}
		
		if(input.length()==1 && input.charAt(0)=='b') {
			return false;
		}
		
		if(input.charAt(0)=='a') {
			boolean smallAns = check(input.substring(1));
			return smallAns;
		}
		
		if(input.charAt(0)=='b' && input.charAt(1)=='b') {
			
			if(input.substring(2).length()!=0 && input.charAt(2)=='b') {
				return false;
			}
			
			boolean smallAns = check(input.substring(2));
			return smallAns;
		}
		
		else {
			return false;
		}
		
	}

}
