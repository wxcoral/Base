package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer, User> map=new HashMap<Integer, User>();
		map.put(1, new User("张三", 32));
		map.put(2, new User("李四", 28));
		map.put(3, new User("王五", 37));
		System.out.println(map);
		HashMap<Integer, User> sort = sort(map);
		System.out.println(sort);
	}
	
	public static HashMap<Integer, User> sort(HashMap<Integer,User> map){
		Set<Entry<Integer,User>> entrySet=map.entrySet();
		List<Entry<Integer,User>> list=new ArrayList<Entry<Integer,User>>(entrySet);
		Collections.sort(list, new Comparator<Entry<Integer, User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				return o1.getValue().getAge()-o2.getValue().getAge();
			}
			
		});
		HashMap<Integer, User> lmap=new LinkedHashMap<Integer, User>();
		for(Entry<Integer, User> entry:list){
			lmap.put(entry.getKey(), entry.getValue());
		}
		return lmap;
	}

}
