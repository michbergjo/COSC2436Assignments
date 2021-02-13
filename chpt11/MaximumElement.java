// Michelle Joseph
// COSC 2436 Assignment 11.4 Method Class

package chpt11;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {
	
	public static Integer max(ArrayList<Integer> list) {
		Integer highestValue; 
		
		//catches exceptions for null list and list of size 0
		if(list.size() == 0 || list.isEmpty() == true) {
			return null;
		}
		
		//finds max value in the ArrayList given 
		highestValue = Collections.max(list);

		
		return highestValue;
	}

}
