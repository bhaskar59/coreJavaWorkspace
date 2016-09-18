package com.coreJava;

import java.util.*;
import java.util.Map.Entry;

public class IterateThroughCollections {

	public static void main(String[] args) {
		//Iteration through collections can be done in 2 eays one is taking key set and 
		//using get key method and other is taking entry set and printing key and value
		
		//using keyset and getkey method
		
		Map<String,Integer>unsortedList = new HashMap<String, Integer>();
		unsortedList.put("sachin", 1);
		unsortedList.put("sourav", 2);
		unsortedList.put("Dravid", 3);
		unsortedList.put("yuvi", 4);
		unsortedList.put("laxman", 5);
		unsortedList.put("Laxman", 6);
		Set<String> keyList=unsortedList.keySet();
		for(String key:keyList){
			System.out.println(unsortedList.get(key));
		}
		
		Set<Entry<String,Integer>> entry =unsortedList.entrySet();
		for(Entry<String,Integer> entries:entry){
			System.out.println(entries.getKey()+" ==> "+entries.getValue()); 
		}

	}

}
