package Default;
import java.util.Arrays;
import java.util.Random;

public class ArrayMethodTester {
	
	//helper method to print an array
	public static void printArray(int[] values) {
		System.out.println(Arrays.toString(values));
	}
	public static void main(String[] args) {
		
		//In your main method you should test your array methods
		//Create an array of size 10
	
		int[] a = new int[10];//array of size 1
		//**** Fill the array with random values (use a loop, and a
		//Random object)
		for(int i = 0; i < a.length; i++) {
			a[0] = (int)(100*Math.random());
			a[1] = (int)(100*Math.random());
			a[2] = (int)(100*Math.random());
			a[3] = (int)(100*Math.random());
			a[4] = (int)(100*Math.random());
			a[5] = (int)(100*Math.random());
			a[6] = (int)(100*Math.random());
			a[7] = (int)(100*Math.random());
			a[8] = (int)(100*Math.random());
			a[9] = (int)(100*Math.random());
		}
		
		//Now print the array to show initial values
		System.out.println("Initial Array:");
		//note the usage of the "toString()" method here to print the array
		System.out.println(Arrays.toString(a));
		//Could replace the previous line with this:
		//printArray(testValues);
		//blank line
		System.out.println();
		
		//Test methods below this line
		
		
		//Test of swapFirstAndLast()
		System.out.println("Before call to swapFirstAndLast():");
		printArray(a);
		//swap first and last element
		//this method modifies the array referenced by "testValues"
		ArrayMethod.swapFirstAndLast(a);
		System.out.println("After call to swapFirstAndLast()");
		printArray(a); //printing the same array but it has changed
		System.out.println();
		
		//continue with tests as you complete methods
		
		
		//Test of shiftRight
		System.out.println("Before shiftRigth: ");
		printArray(a);
		ArrayMethod.shiftRight(a);
		System.out.println("After shiftRight: ");
		printArray(a);
		System.out.println();
		
		
		//Test of setEvensToZero
		System.out.println("Before setEvensToZero: ");
		printArray(a);
		ArrayMethod.setEventsToZero(a);
		System.out.println("After setEvensToZero: ");
		printArray(a);
		System.out.println();
		
		
		//Test of largerOfAdjacents
		System.out.println("Before largerOfAdjacents: ");
		printArray(a);
		ArrayMethod.largerOfAdjacents(a);
		System.out.println("After largerOfAdjacents: ");
		printArray(a);
		System.out.println();
		
		
		//Test of removeMiddle
		System.out.println("Before removeMiddle: ");
		printArray(a);
		ArrayMethod.removeMiddle(a);
		System.out.println("After removeMiddle: ");
		printArray(a);
		System.out.println();
		
		
		//Test of moveEvensToFront
		System.out.println("Before moveEvensToFront: ");
		printArray(a);
		ArrayMethod.moveEvensToFront(a);
		System.out.println("After moveEvensToFront: ");
		printArray(a);
		System.out.println();
		
		
		//Test of ret2ndLargest
		System.out.println("Before ret2ndLargest: ");
		printArray(a);
		ArrayMethod.ret2ndLargest(a);
		System.out.println("After ret2ndLargest: ");
		printArray(a);
		System.out.println();
		
		
		//Test of isSorted
		System.out.println("Before isSorted: ");
		printArray(a);
		ArrayMethod.isSorted(a);
		System.out.println("After isSorted: ");
		printArray(a);
		System.out.println();
		
		
		//Test of hasAdDuplicates
		System.out.println("Before hasAdDuplicates: ");
		printArray(a);
		ArrayMethod.hasAdDuplicates(a);
		System.out.println("After hasAdDuplicates: ");
		printArray(a);
		System.out.println();
		
		
		//Test of hasDuplicates
		System.out.println("Before hasDuplicates: ");
		printArray(a);
		ArrayMethod.hasDuplicates(a);
		System.out.println("After hasDuplicates: ");
		printArray(a);
		System.out.println();
		
		
	}

}
