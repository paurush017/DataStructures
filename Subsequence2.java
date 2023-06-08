public class Subsequence2 {
	
	public static void printSubsequence(String input, String outputSoFar) {
		
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}
		
		printSubsequence(input.substring(1), outputSoFar);
		printSubsequence(input.substring(1), outputSoFar+input.charAt(0));
		
	}

}
