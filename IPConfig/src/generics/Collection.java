package generics;

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
	 * @param arr The parameter that will be place in type collection 'vals'
	 */
	Collection(T[] arr){
		vals = arr;
	}
	
	/**
	 * This method prints the contents of the invoked set to console.
	 * <p>
	 * This method is implemented in {@link generics.IntegerCollection#printCollection()}
	 * & {@link generics.DoubleCollection#printCollection()} 
	 */
	abstract void printCollection();
	
	
	/**
	 * {@inheritDoc}
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
