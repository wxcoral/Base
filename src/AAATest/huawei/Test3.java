package AAATest.huawei;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//定义最大负重，weight数组保存重量，values数组保存价值

		Scanner sc3=new Scanner(System.in);
		String s2=sc3.nextLine();
		String[] str2=s2.split(",");
		int[] value=new int[str2.length];
		for(int j=0;j<str2.length;j++){
			value[j]=Integer.parseInt(str2[j]);
		}
		
		Scanner sc2=new Scanner(System.in);
		String s1=sc2.nextLine();
		String[] str1=s1.split(",");
		int[] weight=new int[str1.length];
		for(int i=0;i<str1.length;i++){
			weight[i]=Integer.parseInt(str1[i]);
		}
		
		Scanner sc1=new Scanner(System.in);
		int max_weight=sc1.nextInt();
		
		greedyPackage(max_weight, weight, value);
	}
	
	

	//
	public static void greedyPackage(int capacity, int[] weight , int[] value) {
		//性价比数组创建并排序
		int n = weight.length;//总个数
		double[] price = new double[n];//性价比数组
		int count[] = new int[n];//序号数组
		
		//求性价比
		for (int i = 0; i < n; i++) {
			price[i] = (double)value[i] / weight[i];
			count[i] = i;
		}
		
		//性价比排序
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n - 1; j++) {
				if (price[j] < price[j + 1]) {
					double tmp = price[j];
					price[j] = price[j + 1];
					price[j + 1] = tmp;
					//交换性价比排序后，再吧序号交换,方便之后取数
					int a = count[j];
					count[j] = count[j + 1];
					count[j + 1] = a;
				}
			}
		}
		
		//把质量和价值也按照性价比的排序顺序对应好，存到新数组里
		int newWeight[] = new int[n];
		int newValue[] = new int[n];
		for (int i = 0; i < n; i++) {
			newValue[i] = value[count[i]];
			newWeight[i] = weight[count[i]];
		}
		
		int maxValue = 0;
		//装东西，优先拿性价比高的
		for (int i = 0; i < n; i++) {
			if (capacity > newWeight[i]) {
				capacity -= newWeight[i];
				maxValue += newValue[i];
			}			
		}
		System.out.print("偷到宝贝的总价值：" + maxValue);
	}
}