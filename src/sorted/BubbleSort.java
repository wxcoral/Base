package sorted;
/**
 * 冒泡排序升序
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={5,8,6,8,3,4,9,2,1};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
