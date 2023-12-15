package Default;
import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

public class ArrayMethod {
	//***NOTE that these methods will change the array itself
	
	
	//part a, fill in this method
	public static void swapFirstAndLast(int[] values) {
		//save the first element to a temp var
		int temp = values[0];
		//move the last element to the first position
		values[0] = values[values.length-1];
		//now out the saved first element into the last position
		values[values.length-1] = temp;
		
	}
	
	//part b, fill in this method
	public static void shiftRight(int[] values) {
		
		int lastElement = values[values.length - 1];
		//shift right
		for(int i = values.length - 1; i > 0; i--) {
			
		}
		
		values[0] = lastElement;
	}
	
	//part c, set all even elements to 0.
	public static void setEventsToZero(int[] values) {
		
		for(int i = 0; i < values.length; i++) 
			if(values[i]%2==0)
				values[i] = 0;
		}
	
	//part d, replace each element except the first and last by larger of two
	//around it
	public static void largerOfAdjacents(int[] values) {
		
		int temp[] = new int[values.length];
		temp[0] = values[0];
		temp[values.length-1] = values[values.length-1];
		for (int i = 1; i < values.length-1; i++) {
			temp[i] = Math.max(values[i-1], values[i+1]);
		}
		values = temp;
	}
	
	//part e, remove middle el if odd length, else remove middle two els.
	public static int[] removeMiddle(int[] values) {
		//replace the following line with your answer
		//this line needed to compile
		if (values.length%2==0) {
			int temp[] = new int[values.length-2];
			int index = 0;
			for (int i = 0; i < values.length; i++) {
				if (i != values.length/2 - 1 && i != values.length/2) {
					temp[index] = values[i];
					index++;
				}
			}
			values = temp;
		}
		else {
			int temp[] = new int[values.length-1];
			int index = 0;
			for (int i = 0; i < values.length; i++) {
				if(i != values.length/2) {
					temp[index] = values[i];
					index++;
				}
			}
			
			values = temp;
		}
		
		
		return null;
	}  
	
	//part f - move all event to front
	public static void moveEvensToFront(int[] values) {
		
		int temp[] = new int[values.length];
		int index = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i]%2==0) {
				temp[index] = values[i];
				index++;
			}
		}
		for (int i = 0; i < values.length; i++) {
			if (values[i]%2!=0) {
				temp[index] = values[i];
				index++;
			}
		}
		values = temp;
		
	}
	
	//part g - return second largest element in array
	public static int ret2ndLargest(int[] values) {
		//replace this line with your correct return value
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > max ) {
				max = values[i];
			}
		}
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > secmax && values[i] != max) {
				secmax = values[i];
			}
		}
		return 0;
	}
	
	//part h - return true if array is sorted in increasing order
	public static boolean isSorted(int[] values) {
		//replace this line with your correct return value
		for (int i = 1; i < values.length; i++) {
			if (values[i-1] > values[i]) {
				return false;
			}
		}
		return true;
	}
	
	//part i - return true if array contains 2 adjacent duplicate values
	
	public static boolean hasAdDuplicates(int[] values) {
		
		for (int i = 1; i < values.length; i++) {
			if (values[i-1] == values[i]) {
				return true;
			}
		}
		
		return false; //dummy return value
	}
	
	//Part J - return true if array contains 2 duplicate values
	//duplicates need not be adjacent to return true
	
	public static boolean hasDuplicates(int[] values) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < values.length; i++) {
			if (hashSet.contains(values[i])) {
				return true;
			}
			hashSet.add(values[i]);
		}
		return false;
	}
}