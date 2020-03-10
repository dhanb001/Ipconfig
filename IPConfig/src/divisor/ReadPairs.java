package divisor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class will take a file and read the integers inside it, 
 * creating an {@link IntPair} ArrayList that will be used in {@link PairThread}
 * <p>
 * The only method that can be called externally is {@link createPairs}.
 * <p>
 * The other method, {@link createInts}, is called internally by {@link createPairs}
 * @author Dalton
 *
 */
public class ReadPairs {
	
	/**
	 * This static method takes a file and returns an ArrayList of {@link IntPair Integer Pairs}
	 * @param f The file containing comma-separated integers, received from
	 * {@link FileFinder#getFile(String)}
	 * @return Returns an ArrayList of {@link IntPair Integer Pairs}
	 * @throws FileNotFoundException This is thrown, because an exception would have 
	 * already occurred in {@link FileFinder#getFile(String)}
	 */
	public static ArrayList<IntPair> createPairs(File f) throws FileNotFoundException{
		ArrayList<Integer> result = new ArrayList<Integer>();//Instantiate result
		//result = createInts(f);
		
		result = createInts(f); //Call method to add integer values to result
		
		ArrayList<IntPair> pairList = new ArrayList<>(); //Create ArrayList of IntPairs
		
		for (int i = 0; i<result.size()/2; i++)
		{
			if(i == 0) {
				pairList.add(new IntPair(result.get((i)),result.get((i+1)),i+1));
			}
			else {
			 pairList.add(new IntPair(result.get((i*2)),result.get((i*2+1)),i+1));
			}
		}
		
		return pairList; //Return the ArrayList of Pairs
		
	}
	/**
	 * This private, internally used method takes a file and adds integers to 
	 * an ArrayList.
	 * <p>
	 * An Integer ArrayList is returned by this method.
	 * @param f The file containing comma-separated integers
	 * @return Returns an ArrayList containing the Integers from file
	 * @throws FileNotFoundException This is thrown, because an exception would have 
	 * already occurred in {@link FileFinder#getFile(String)}
	 */
	private static ArrayList<Integer> createInts(File f) throws FileNotFoundException {
		//ArrayList must be used because amount of pairs may change
		ArrayList<Integer> intList = new ArrayList<Integer>();
 		
		//Now read integers from given file using scanner
		
		Scanner s = new Scanner(new FileReader(f)); //This line forces us to throw FileNotFound exception
		//See @throws in Javadoc for reasoning
		
		s.useDelimiter("\\D"); //Delimiter marks any non-digit items
		//The delimiter ensures only the integers are read from file
		
		while (s.hasNext()) { //While there is another integer in file
			intList.add(s.nextInt()); //Add integers to ArrayList
	    }
	    s.close(); //Close the scanner
	    
	    //Method is finished, return intList
	    return intList;
	}
}
