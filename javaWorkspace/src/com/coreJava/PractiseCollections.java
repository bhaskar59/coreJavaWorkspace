package com.coreJava;
import java.util.*;

public class PractiseCollections {

	public static void main(String[] args) {
		Map<String,Integer>unsortedList = new HashMap<String, Integer>();
		unsortedList.put("sachin", 1);
		unsortedList.put("sourav", 2);
		unsortedList.put("Dravid", 3);
		unsortedList.put("yuvi", 4);
		unsortedList.put("laxman", 5);
		unsortedList.put("Laxman", 6);
		
		 List<Map.Entry<String, Integer>> list =
	                new LinkedList<Map.Entry<String, Integer>>(unsortedList.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<String,Integer> entry:sortedMap.entrySet()){
        	System.out.println(entry.getKey()+entry.getValue());
        	
        }
	}
}
