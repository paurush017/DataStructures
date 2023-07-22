public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {11,2,35,24,59};
		bubble(arr);
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}
	
	static void bubble(int[] arr) {
		
		boolean swapped;
		
		// Run the steps n-1 times
		for(int i=0; i<arr.length; i++) {
			swapped = false;
			// for each step, max item will come at the last respective index
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		
	}

}
