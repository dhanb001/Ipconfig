package gcdfail;

import java.util.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.*;
import java.net.URISyntaxException;
import java.net.URL;




/**
 * The FAILED Driver class for the GCD assignment. I kept this only for reference.
 * <p>
 * This package can be used as a way to see my thought process and learning. Many of the equations used here were refined and used again in divisor.
 * <p>
 * The correct driver is in {@link divisor.GreatestDivisor}
 * @author Dalton
 *
 */
class DivisorDemo {

	
		
	
	public static void main(String args[]) throws URISyntaxException, IOException {
		
		//This block lambda computes greates common divisor of two integers without recursion
				DivisorFunc gcd = (a,b) -> {
					int bigger;
					int smaller;
					if (a > b)
					{
						bigger = a;
						smaller = b;
					} 
					else if(a == b) {
						return a;
					}
					else {
						bigger = b;
						smaller = a;
					}
					 while (true) {
						 int remainder = bigger % smaller;
						 if (remainder==0) {
							 return smaller;
						 }
						 else {
							 bigger = smaller;
							 smaller = remainder;
						 }
					 }
				};
		//System.out.println("Working Directory = " +
	    //         System.getProperty("user.dir"));
		
		//Load text file using relative path and ClassLoader
		URL path = ClassLoader.getSystemResource("gcdfail/intpairs.txt");
		
		if (path==null) {
			//File wasn't found, insert error handling here
			System.out.println("File not found");
		}
		File f = new File(path.toURI());
		
		//ArrayList must be used because amount of pairs may change
		ArrayList<Integer> result = new ArrayList<>();
		 
		
		//This area scans the intpairs file and puts ints into result
		
		try (Scanner s = new Scanner(new FileReader(f))) {
			s.useDelimiter("\\D"); //Delimiter marks any non-digit items
			//The delimiter ensures only the integers are read from file
		    while (s.hasNext()) {
		        result.add(s.nextInt());
		    }
		    s.close(); //Close the scanner
		}

		
		result.forEach((n)-> System.out.println(n));
		//Test to see that arraylist result was filled by file
		

		//Takes an arraylist of ints and generates a pairList
		ArrayList<IntPair> pairList = new ArrayList<>();
		
		for (int i = 0; i<result.size()/2; i++)
		{
			if(i == 0) {
				pairList.add(new IntPair(result.get((i)),result.get((i+1)),i+1));
			}
			else {
			 pairList.add(new IntPair(result.get((i*2)),result.get((i*2+1)),i+1));
			}		
		}
		
		//Takes each pair and runs them as an individual thread
		for(IntPair pair: pairList) {
			PairThread pt = new PairThread(pair); //Each thread accesses different pairs
			pt.start();//This helps with concurrency and preventing access conflicts
			
			//PairThread pnew PairThread((pair)
		}

	}

}
