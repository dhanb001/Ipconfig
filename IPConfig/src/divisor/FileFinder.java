package divisor;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * This class will find the specified file and return it 
 * using a relative or absolute path
 * @author Dalton
 *
 */
public class FileFinder {
	
	/**
	 * Retrieves file using relative/absolute path indicator s
	 * @param s This is a string representation of the location of the file
	 * i.e. "divisor/intpairs.txt"
	 * @return Returns a File that will be used in {@link ReadPairs}
	 * @throws URISyntaxException Throws URI exceptions, string should be readable.
	 */
	public static File getFile(String s) throws URISyntaxException {
		//Find the URL using relative/absolute path indicator
		URL path = ClassLoader.getSystemResource(s);
		
		//Check if path exists
		if (path==null) {
			//File wasn't found, replace relative path with absolute path for
			//"intpairs.txt"
			System.out.println("File not found, consider replacing relative path with "
					+ "absolute path for \"divisor.intpairs.txt\"\n"
					+ "See FileFinder.Java in the Divisor package.");
		}
		//Creates file using the Uniform Resource Identifier of path
		File f = new File(path.toURI());
		
		//Return the file obtained from path
		return f;
	}

}