package generics;

/**
 * This is the DoubleCollection class which extends the abstract Collection class,
 * {@link Collection}.
 * <p>
 * This class holds double objects and is able to print the minimum and maximum
 * values by directly using {@link Collection#min()} and {@link Collection#max()}.
 * <p>
 * NOTE: No specific implementation for min() and max() is needed in this class 
 * because it is implemented as a generic method in {@link Collection}
 * @author Dalton
 *
 */
public class DoubleCollection extends Collection<Double> {
	
	/**
	 * Numeric identifier used for output in {@link #printCollection()}.
	 */
	int id;
	
	/**
	 * This is the constructor for DoubleCollection, 
	 * it uses {@link Collection#Collection(Comparable[])} to generate
	 * a collection of Double values.
	 * <p>
	 * The numeric identifier for the collection is defined by {@link #id}
	 * @param arr This is a collection of type Double, which will be used to store double values. 
	 * It is inherited from {@link Collection#vals}.
	 * @param num This value is the integer parameter for {@link #id}.
	 */
	DoubleCollection(Double[] arr, int num) {
		super(arr);
		id = num;
	}
	
	
	/**
	 * Prints the contents of theDouble set to console, 
	 * implemented from {@link Collection#printCollection()}.
	 */
	void printCollection() {
		System.out.println("Values for Double Array #"+id+":");
		
		for (int i = 0; i <super.vals.length;i++) {
			System.out.print(super.vals[i]+" "); //Print the array value at index i
		}
		System.out.println("\n");
	}

}
