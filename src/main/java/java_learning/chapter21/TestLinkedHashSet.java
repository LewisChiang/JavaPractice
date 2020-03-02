package java_learning.chapter21;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a hash set
		Set<String> set = new LinkedHashSet();
		
		//Add strings to a set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		//Display the elements in the hash set
		for (String element : set) {
			
			System.out.print(element.toUpperCase() + " ");
			
		}

	}

}
