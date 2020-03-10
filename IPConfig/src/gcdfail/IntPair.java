package gcdfail;

/**
 * This class holds integers in specified pairs.
 * <p>
 *  This allows for safe movement between classes and  
 *  storage in ArrayLists.
 * @author Dalton
 *
 */
class IntPair {
	/**
	 * The left integer value of the pair.
	 */
	private int left;
	/**
	 * The right integer value of the pair.
	 */
	private int right;
	/**
	 * The ID for the pair, which identifies when it was read from file
	 * <p> 
	 * Ex. 1=1st pair read from file, 4=4th pair read from file, etc.
	 */
	private int pairID;
	
	/**
	 * The non-default constructor for IntPair, it creates an Integer Pair.
	 * @param l The int parameter for {@link #left}
	 * @param r The int parameter for {@link #right}
	 * @param pairNum The int parameter for {@link #pairID}
	 */
	public IntPair(Integer l, Integer r, int pairNum)
	{
		left = l;
		right = r;
		pairID = pairNum;
	}
	
	/**
	 * Getter method for {@link #left}
	 * @return The integer representation of the left pair value
	 */
	public int getLeft() {
		return left;
	}
	/**
	 * Getter method for {@link #right}
	 * @return The integer representation of the right pair value
	 */
	public int getRight() {
		return right;
	}
	/**
	 * Getter method for {@link #pairID}
	 * @return The integer representation of the Integer Pair's ID
	 */
	public int getID() {
		return pairID;
	}
	
	/**
	 * This method prints the information of a Pair to console.
	 * <p>
	 * The {@link #pairID}, {@link #left left value}, and {@link #right right value} are printed to console.
	 */
	public void printPair() {
		System.out.println("Pair #"+ pairID+"\n"
				+ "Left: "+left+"\tRight: "+right);
	}
}
