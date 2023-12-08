package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		// Set<String> list = new HashSet<>();
		SortedSet<String> list = new TreeSet<>();
		list.add("Peter");
		list.add("Silver");
		list.add("Ana");
		
		for(String name: list) {
			System.out.println(name);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(11);
		nums.add(14);
		nums.add(12324);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
		
		
	}
}
