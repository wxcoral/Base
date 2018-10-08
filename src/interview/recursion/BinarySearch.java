package interview.recursion;

public class BinarySearch {
	
	public int binarySearch(int[] arr,int k){
		int a=0;
		int b=arr.length;
		//Loop invariant:[a,b) is a valid range(a<=b)
		//k may only be within range [a,b).
		
		while(a<b){
			int m=a+(b-a)/2;
			if(k<arr[m]){
				b=m;
			} else if(k>arr[m]){
				a=m+1;
			}else{
				return m;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
	}
}
