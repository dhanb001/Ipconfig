package generics;


/**This is a simple generic interface utilizing an arbitrary type T that extends
 * the Comparable interface.
 * <p>
 * By extending Comparable we have an upper bound that
 * ensures our types are always capable of being compared.
 * <p>
 * This interface's purpose is to facilitate the use of the min() and max() functions, 
 * which will return the minimum and maximum value of a given set of objects.
 * 
 * @author Dalton
 *
 * @param <T> The placeholder for the actual type that will be passed upon creation.
 */
interface MinMax <T extends Comparable<T>>{
	/**Generic method in MinMax interface
	 * <p>
	 * This method finds and returns the minimum value found in a given set of objects.
	 * @return Returns a value type, T, that will be determined upon implementation.
	 */
	T min();
	
	/**Generic method in MinMax interface
	 * <p>
	 * This method finds and returns the maximum value found in a given set of objects.
	 * @return Returns a value type, T, that will be determined upon implementation.
	 */
	T max();

}
