package AAATest.zhongxin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 频次较高的的工资出现在频次较低的工资之前，工资值和出现频次相同时，先出现的排在前面
 * @author Administrator
 *
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=Integer.parseInt(in.nextLine());
		String input=in.nextLine();
		String s=input.substring(1,input.length()-1);
		String[] sals=s.split(",");
		int[] salaries=new int[num];
		for(int i=0;i<num;i++){
			salaries[i]=Integer.parseInt(sals[i]);
		}
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int sal:salaries){
			if(map.containsKey(sal)){
				map.put(sal,map.get(sal)+1);
			}else{
				map.put(sal, 1);
			}	
		}
		
		//直接对map按照value排序
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> list=new ArrayList<Entry<Integer, Integer>>(entrySet);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}	
		});
		
		List<Integer> output=new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : list) {
			for(int i=0;i<entry.getValue();i++){
				output.add(entry.getKey());
			}
		}
		
		
		/*
		 * //获取次数
		Collection c=map.values();
		Set<Integer> set =new HashSet<Integer>(c);
		List<Integer> order=new ArrayList<Integer>(set);
		//次数排序
		Collections.sort(order);
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for(int k=order.size()-1;k>=0;k--){
			for (Entry<Integer, Integer> entry : entrySet) {
				if(entry.getValue()==order.get(k)){
					for(int j=0;j<order.get(k);j++){	
						output.add(entry.getKey());
					}
				}
			}
		}*/
		System.out.println(output.toString());
	}
}
