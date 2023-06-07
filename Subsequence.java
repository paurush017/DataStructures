public class Subsequence {

	public String[] findSubsequence(String str){
		
		if(str.length()==0) {
			String[] ans = {""};
			return ans;
		}
		
		String[] smallAns = findSubsequence(str.substring(1));
		
		String[] ans = new String[smallAns.length*2];
		
		for(int i=0; i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length]=str.charAt(0)+smallAns[i];
		}
		
		return ans;
		
	}
	
}
