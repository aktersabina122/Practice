package com.hcl.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHsetDemo {
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Vinod");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		System.out.println("Hashset Data");
		
		s.forEach(System.out::println);
	}
}
