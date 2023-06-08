public class Staircase {
	
	public int stair(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		
		if(n<0) {
			return 0;
		}
		
		return stair(n-1)+stair(n-2)+stair(n-3);
		
	}

}
