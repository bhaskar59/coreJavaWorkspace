package com.coreJava;

import java.util.*;  
import java.util.Map.Entry;
import java.io.*;  
public class CollectionsWorkspace{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
//Collections.sort(al);  
for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  

Map<String,Integer>unsortedList = new HashMap<String, Integer>();
unsortedList.put("sachin", 1);
unsortedList.put("sourav", 2);
unsortedList.put("Dravid", 3);
unsortedList.put("yuvi", 4);
unsortedList.put("laxman", 5);
unsortedList.put("Laxman", 6);

 List<Map.Entry<String, Integer>> list =
            new LinkedList<Map.Entry<String, Integer>>(unsortedList.entrySet());


Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
for (Map.Entry<String, Integer> entry : list) {
    sortedMap.put(entry.getKey(), entry.getValue());
}

for(Map.Entry<String,Integer> entry:sortedMap.entrySet()){
	System.out.println(entry.getKey()+entry.getValue());
	
}
}  
}  

class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}  