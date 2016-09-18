package com.coreJava;

import java.util.*;
import java.util.Map.Entry;

public class SortingUsingComparable {

	public static void main(String[] args) {
		Map<String,Integer>sortedList = new LinkedHashMap<String, Integer>();
		Map<String,Integer>unsortedList = new HashMap<String, Integer>();
		unsortedList.put("sachin", 1);
		unsortedList.put("sourav", 2);
		unsortedList.put("Dravid", 3);
		unsortedList.put("yuvi", 4);
		unsortedList.put("laxman", 5);
		unsortedList.put("Laxman", 6);
		
		Set<String> set =unsortedList.keySet();
		List list = new ArrayList(set);
		Collections.sort(list);
		for(Object s :list){
			System.out.println(s);
		}
		
		Set<String>sortedset=new LinkedHashSet<String>(list);
		for(Object s1 :sortedset){
			System.out.println(s1);
		}
		
		for(String key:sortedset){
			sortedList.put(key, unsortedList.get(key));
		}
		Set<Entry<String,Integer>> entry =sortedList.entrySet();
		for(Entry<String,Integer> entries:entry){
			System.out.println(entries.getKey()+" ==> "+entries.getValue()); 
		}
	}

}
