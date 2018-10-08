package sorted;
/**
 * 选择排序   最坏时间复杂度o(n^2)
 * @author Administrator
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] arr={3,1,5,7,2,4,9,6,10,8};
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			swap(arr,min,i);
		}
		
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	private static void swap(int[] arr, int k, int i) {
		if(i==k)
			return;
		int temp=arr[k];
		arr[k]=arr[i];
		arr[i]=temp;
	}
}
