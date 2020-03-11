package divisor;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

/**
 * The driver for the proper implementation of the Greatest Common Divisor assignment.
 * <p>
 * If you'd like to see the mistakes I made the first time I tried to answer this, see {@link gcdfail.DivisorDemo}.
 * @author Dalton
 *
 */
class GreatestDivisor {
	
	/**
	 * The main method for the proper answer to the Greatest Common Divisor prompt
	 * <p>
	 * If you'd like to change the file being read, it is called by name in this method. 
	 * This is the only place you have to change. Try using "pairs2.txt" if you want to test it
	 * @param args Main method
	 * @throws FileNotFoundException This exception is thrown due to compiler insistence. 
	 * The file is in a relative path.
	 * @throws URISyntaxException This exception is related again to compiler insistence. 
	 * The file should always have proper URI syntax unless tampered with
	 */
	public static void main(String[] args) throws FileNotFoundException, URISyntaxException 
    { 
		//First find the file by calling getFile in FileFinder
		File f =FileFinder.getFile("divisor/intpairs.txt"); //TO CHANGE FILE, EDIT THIS LINE<<<
		//If FileNotFound exceptions occur, put absolute path of intpairs.txt into .getFile()
		
		//Use ReadPairs to read file, find integers, and place them into intList
		ArrayList<IntPair> intList = ReadPairs.createPairs(f);
		
		//Start threads once pairs are obtained
        new GreatestDivisor().startThreads(intList);
        
        
    }

	/**
	 * This private, void method starts the threads, which then calculate the GCD for individual pairs using a lambda.
	 * <p>
	 * NOTE: Because individual threads are used, output may not be in proper order. 
	 * This displays concurrency.
	 * <p>
	 * A walkthrough of this problem set isn't practical inside of the driver, 
	 * so we will put it in the README provided in Github.
	 * @param pList The ArrayList of Integer pairs that will be used to calculate GCD's
	 */
	private void startThreads(ArrayList<IntPair> pList) {
		
		//ArrayList<IntPair> pairList = pList;
		
		ExecutorService taskList 
        	= Executors.newFixedThreadPool(pList.size());
		//Size of thread pool is equal to number of pairs
		//Each pair will be compared side-by-side, in individual threads
		
		
		
		System.out.println("Find GCD using Binary GCD Algorithm\n\n"); //Source of algorithm ->https://www.baeldung.com/java-greatest-common-divisor
		//Because lambdas are anonymous, and a recursive function calls itself, making this recursive wasn't practical.
		//I was forced to find a non-brute force method of finding the GCD, so I used the one from baeldung but made it work with Pairs.
		
		System.out.println("The default file being read is \"divisor/intpairs.txt\"\n"
				+ "If you'd like to change the numbers in that file, you may, however there are constraints.\n"
				+ "1)The integers must be >= 0\n"
				+ "2)The integers must be in pairs of 2.\n"
				+ "3)The integers must be separated ONLY by commas, spaces in the file will cause reading errors.\n");
		
		System.out.println("The number of threads executed is equivalent to the number of pairs you have, "
				+ "so feel free to test your system or my program!\n");
		//This program has not been stress-tested, so the amount of threads it can handle is unknown
		
		
		//This loop assigns each thread a number, which will be used to access a IntPair
		for (int i = 0; i<pList.size();i++)
		{
			//finalI gives us a (seemingly) final value that we can access inside of the Lambda.
			int finalI = i;
			
			//BEGIN LAMBDA OPERATION IN INDIVIDUAL THREADS
			taskList.execute(() -> {
				
				//Identify the thread running when they are executed, this demonstrates concurrency. INCLUDE IF YOU WISH
				//System.out.println(Thread.currentThread().getName()+" Pair# "+(finalI+1));
				
				IntPair p = pList.get(finalI); //Thread accesses the IntPair associated with the loop value(i/FinalI)
				
				int l = p.getLeft();//Assigns the left value in pair p to int l, this saves us from calling p.getLeft()
				
				int r = p.getRight();//Assigns the right value in pair p to int r, this saves us from calling p.getRight()
				
				//This system for finding GCD utilizes the Binary GCD Algorithm
				if (l == 0) { //If 'l' is zero, the GCD is 'r'
					p.printPair();
					System.out.println("The GCD of pair #"+p.getID()+" = "+ r+"\n");
			    }
			 
			    if (r == 0) { //If 'r' is zero, the GCD is the 'l'
			    	p.printPair();
			    	System.out.println("The GCD of pair #"+p.getID()+" = "+ l+"\n");
			    }
			 
			    //Find n, where n is the greatest power of 2 that divides both 'l' and 'r'
			    int n;
			    for (n = 0; ((l | r) & 1) == 0; n++) {
			        l >>= 1;
			        r >>= 1;
			    }
			    //Divide 'l' by 2 until 'l' becomes odd
			    while ((l & 1) == 0) {
			        l >>= 1;
			    }
			    //now 'l' is always odd
			    do {
			    	//If 'r' is even, remove all factors of 2 in 'r'
			        while ((r & 1) == 0) {
			            r >>= 1;
			        }
			        
			        //Now 'l' and 'r' are both odd. Swap if needed so 'l' <= 'r'
			        if (l > r) {
			            int temp = l;
			            l = r; //swap 'l' and 'r'
			            r = temp;
			        }
			        r = (r - l); //Set 'r' = 'r' - 'l' (which is even)
			    } while (r != 0);
			    p.printPair();
			    System.out.println("The GCD of pair #"+p.getID()+" = "+ (l << n)+"\n");
			    // 'l' << 'n' restores common factors of 2, giving us the GCD
			});
		}
		taskList.shutdown(); //This rejects any new tasks when invoked
		//And allows previously submitted code to execute before terminating
	
	} 
	//Explanation of Binary GCD Algorithm interpreted/referenced from https://www.geeksforgeeks.org/steins-algorithm-for-finding-gcd/
	
}
