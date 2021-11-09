package org.test;




import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Mark {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		System.out.println(m);
		Set<Entry<Integer, String>> a = m.entrySet();
		for(Entry<Integer,String> m1:a) {
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		
		

	}
	

}
