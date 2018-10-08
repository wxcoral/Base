package sorted;
/**
 * 插入排序,时间复杂度o(n^2)
 * @author Administrator
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr={5,8,6,8,3,4,9,2,1};
		for(int i=1;i<arr.length;i++){
			int j=i;
			while(j>0&&arr[j]<arr[j-1]){
				swap(arr,j,j-1);
				j--;
			}
		}
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}	
		
	private static void swap(int[] arr, int k, int i) {
		int temp=arr[k];
		arr[k]=arr[i];
		arr[i]=temp;
	}
		
	
}
