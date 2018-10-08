package AAATest.huawei;

public class Test2 {
	public static void main(String[] args) {
		int val[]={6,3,5,4,6};
		int wgt[]={2,2,6,5,4};
		int cap=10;
		System.out.println(getMax(val, wgt, cap));
	}
	
	public static int getMax(int[] val,int[] wgt,int cap){
		int n=wgt.length;
		int[][] v=new int[n+1][cap+1];
		for(int i=0;i<=cap;i++){
			v[0][i]=0;
		}
		for(int j=0;j<=n;j++){
			v[j][0]=0;
		}
		
		for(int item=1;item<n;item++){
			for(int weight=1;weight<cap;weight++){
				if(wgt[item-1]<=weight){
					v[item][weight]=Math.max(val[item-1]+v[item-1][weight-wgt[item-1]],v[item-1][weight]);
				}else{
					v[item][weight]=v[item-1][weight];
				}
			}
		}
			
		for(int[] rows:v){
			for(int col:rows){
				System.out.format("%5d", col);
			}
			System.out.println();
		}
		return v[n][cap];	
	}
}
