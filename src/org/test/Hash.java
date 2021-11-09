package org.test;



import java.util.LinkedHashSet;
import java.util.Set;

public class Hash {
	public static void main(String[] args) {
	Set<Integer> s = new LinkedHashSet<Integer>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	s.add(70);
	s.add(80);
	s.add(90);
	s.add(10);
	s.add(200);
	System.out.println(s);
	}

}
