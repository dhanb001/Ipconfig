package gcdfail;

interface DivisorFunc {
	/**
	 * This functional interface facilitates the use of our greatest common divisor lambda in 
	 * {@link DivisorDemo}
	 * @param n The first int being compared by the GCD lambda
	 * @param d The second int being compared by the GCD lambda
	 * @return The lambda will return the greatest common divisor between the two parameters
	 */
	int func (int n, int d);
}
