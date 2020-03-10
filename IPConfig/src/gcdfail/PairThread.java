package gcdfail;

class PairThread extends Thread {
	private IntPair pair;
	public PairThread(IntPair p){
		pair = p;
	}
	
	/**
	 * An awful implementation of a method to find the GCD. In the finalized version, I used the Binary GCD algorithm
	 */
	public void run() {
		int l = pair.getLeft();
		int r = pair.getRight();
		int bigger =0;
		int smaller=0;
		if (l > r)
		{
			bigger = l;
			smaller = r;
		} 
		else if(l == r) {
			System.out.println("The greatest common divisor for pair #"
					+ pair.getID() +" is "+ l);;
		}
		else {
			bigger = r;
			smaller = l;
		}
		while (true) {
			int remainder = bigger % smaller;
			if (remainder==0) {
				System.out.println("The greatest common divisor for pair #"
						+ pair.getID() +" is "+ smaller);
				break;
			}
			else {
				bigger = smaller;
				smaller = remainder;
			}
		}
		

	};
}


