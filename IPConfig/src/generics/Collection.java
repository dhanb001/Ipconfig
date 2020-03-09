package generics;

/**
 * This is the abstract Collection class that implements the generic interface {@link MinMax}.
 * <p>
 * This class provides methods for collections(arrays) of comparable types. 
 * It provides non-type-specific methods for calculating the minimum and maximum values in the collections.
 * <p> 
 * The extending classes must provide their own 
 * implementation for the abstract method {@link #printCollection()} however.
 * <p>
 * NOTE: Because this class is abstract, and non-generic classes require an explicit
 * type to be invoked, the extending classes specify the type used within them. 
 * <p>
 * Collections of type Double are created using {@link DoubleCollection} &
 * Collections of type Integer are created using {@link IntegerCollection}.
 * @author Dalton
 *
 * @param <T> The placeholder for the actual type that will be determined when a Collection is created.
 */
abstract class Collection<T extends Comparable<T>> implements MinMax<T> {
	
	/**
	 * The protected collection of type values, this value can be accessed by
	 * using 'super' in the classes that extend Collection.
	 * <p>
	 * To enable the use of different type collections, 
	 * we did not define its type here.
	 * <p>
	 * Its type is determined by the classes that implement it.
	 */
	protected T[] vals; 
	
	/**
	 * This is the default, unspecified, type constructor for our Collections.
	 * <p>
	 * The collections that extend and implement this class will define their own types for it.
	 * @param arr The parameter that will be placed in type collection {@link #vals}
	 */
	Collection(T[] arr){
		vals = arr;
	}
	
	/**
	 * This method prints the contents of the invoked set to console.
	 * <p>
	 * This method is implemented in {@link IntegerCollection#printCollection()}
	 * & {@link DoubleCollection#printCollection()}
	 * <p>
	 * Because this method is abstract, the extending classes MUST implement it.
	 */
	abstract void printCollection();
	
	
	/**
	 * {@inheritDoc}
	 * <p>NOTE: Due to the generic method being in {@link MinMax}, a type for
	 * T did not need to be defined. 
	 * This allows the method to be used in {@link IntegerCollection} & {@link DoubleCollection} 
	 * without creating new methods in those classes.
	 * <p>
	 * This demonstrates code reuse.
	 */
	public T min() {
		T v = vals[0]; //Set v as first index in collection
		
		//Start at i = 1 and iterate through array, searching for lowest value.
		for(int i=1; i < vals.length; i++) {
			if(vals[i].compareTo(v) < 0) { 	//If current(vals[i]) is less than v
				v = vals[i]; 				//Replace v with current
			}
		}
		return v; //Return the lowest value, v
	}
	
	/**
	 * {@inheritDoc}
	 * <p>NOTE: Due to the generic method being in {@link MinMax}, a type for
	 * T did not need to be defined. 
	 * This allows the method to be used in {@link IntegerCollection} & {@link DoubleCollection} 
	 * without creating new methods in those classes.
	 * <p>
	 * This demonstrates code reuse.
	 */
	public T max() {
		T v = vals[0]; //Set v as first index in collection
		
		//Start at i = 1 and iterate through array, searching for highest value.
		for(int i=1; i < vals.length; i++) {
			if(vals[i].compareTo(v) > 0) { 	//If current(vals[i]) is greater than v
				v = vals[i]; 				//Replace v with current
			}
		}
		return v; //Return the highest value, v
	}

}
