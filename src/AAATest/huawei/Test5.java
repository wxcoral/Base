package AAATest.huawei;
public class Test5 {
	public static void main(String[] args) {
		String s="())(()";
		if(s.length()<1)
			System.out.println(0);
		int[] a=new int[s.length()];
		int pre=0;
		int res=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==')'){
				pre=i-a[i-1]-1;
				if(pre>=0&&s.charAt(pre)=='(')
					a[i]=a[i-1]+2+(pre>0?a[pre-1]:0);
			}
			res=Math.max(res, a[i]);
		}
		System.out.println(res);
	}
}

