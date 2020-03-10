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
 * If you'd like to see the mess I made the first time I tried to answer this, see {@link gcdfail.DivisorDemo}
 * @author Dalton
 *
 */
public class GreatestDivisor {
	
	public static void main(String[] args) throws FileNotFoundException, URISyntaxException 
    { 
		//First find the file by calling getFile in FileFinder
		File f =FileFinder.getFile("divisor/intpairs.txt"); //Throw exceptions
		//If FileNotFound exceptions occur, put absolute path of intpairs.txt into .getFile()
		
		//Use ReadPairs to read file, find integers, and place them into intList
		ArrayList<IntPair> intList = ReadPairs.createPairs(f);
		
		//Start threads once pairs are obtained
        new GreatestDivisor().startThreads(intList); 
    }

	private void startThreads(ArrayList<IntPair> pList) {
		
		//ArrayList<IntPair> pairList = pList;
		
		ExecutorService taskList 
        	= Executors.newFixedThreadPool(pList.size());
		//Size of thread pool is equal to number of pairs
		
		for (int i = 0; i<pList.size();i++)
		{
			int finalI = i;
			taskList.execute(() -> {
				
				System.out.println(Thread.currentThread().getName()+" Pair: "+finalI);
				
				IntPair p = pList.get(finalI);
				p.printPair();
				int l = p.getLeft();
				int r = p.getRight();
				if (l == 0) {
					System.out.println("The GCD of pair #"+p.getID()+" = "+ r);
			    }
			 
			    if (r == 0) {
			    	System.out.println("The GCD of pair #"+p.getID()+" = "+ l);
			    }
			 
			    int n;
			    for (n = 0; ((l | r) & 1) == 0; n++) {
			        l >>= 1;
			        r >>= 1;
			    }
			 
			    while ((l & 1) == 0) {
			        l >>= 1;
			    }
			 
			    do {
			        while ((r & 1) == 0) {
			            r >>= 1;
			        }
			 
			        if (l > r) {
			            int temp = l;
			            l = r;
			            r = temp;
			        }
			        r = (r - l);
			    } while (r != 0);
			    System.out.println("The GCD of pair #"+p.getID()+" = "+ (l << n));
			    //Shift l's bits left by distance n and return value
			});
		}
		
	} 

}
