package generics;


/**
 * This is the IntegerCollection class which extends the abstract Collection class,
 * {@link Collection}.
 * <p>
 * This class holds integer objects and is able to print the minimum and maximum
 * values by directly using {@link Collection#min()} and {@link Collection#max()}.
 * <p>
 * NOTE: No specific implementation for min() and max() is needed in this class 
 * because it is implemented as a generic method in {@link Collection}. This qualifies as code reuse.
 * @author Dalton
 *
 */
public class IntegerCollection extends Collection<Integer> { 
	//T cannot be used because it cannot be resolved to a type. A SPECIFIC type must be chosen.
	
	/**
	 * Numeric identifier used for output in {@link #printCollection()}.
	 */
	int id;
	
	/**
	 * This is the constructor for IntegerCollection, 
	 * it uses {@link generics.Collection#Collection(Comparable[])} to generate
	 * a collection of Integer values.
	 * <p>
	 * The numeric identifier for the collection is defined by {@link #id}
	 * @param arr This is a collection of type Integer, which will be used to store integer values. 
	 * It is inherited from {@link Collection#vals}.
	 * @param num This value is the integer parameter for {@link #id}.
	 */
	IntegerCollection(Integer[] arr, int num) {
		super(arr);
		id = num;
	}
	
	/**
	 * Prints the contents of the Integer set to console, 
	 * implemented from {@link Collection#printCollection()}.
	 */
	void printCollection() {
		System.out.println("Values for Integer Array #"+id+":");
		
		for (int i = 0; i <super.vals.length;i++) {
			System.out.print(super.vals[i]+" "); //Print the array value at index i
		}
		System.out.println("\n");
	}
}
