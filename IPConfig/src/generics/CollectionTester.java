package generics;

public class CollectionTester {
	public static void main(String args[]) {
		
		Integer[] intArray1 = { 1, 5, 10, 3, -2, 4};
		IntegerCollection intCollect1 = new IntegerCollection(intArray1, 1);
		
		intCollect1.printCollection();
		
		System.out.println("Maximum number in Integer Array 1 = "+(intCollect1.max()));
		System.out.println("Minimum number in Integer Array 1 = "+(intCollect1.min())+"\n");
		Integer[] intArray2 = {2, 6, 9, 13, 2, -5};
		IntegerCollection intCollect2 = new IntegerCollection(intArray2, 2);
		
		intCollect2.printCollection();
		
		System.out.println("Maximum number in Integer Array 2 = "+(intCollect2.max()));
		System.out.println("Minimum number in Integer Array 2 = "+(intCollect2.min())+"\n\n");
		
		Double[] doubleArray1 = {1.5, 5.3, 10.2, 3.1, -2.7, 4.9};
		DoubleCollection doubleCollect1 = new DoubleCollection(doubleArray1, 1);
		
		doubleCollect1.printCollection();
		System.out.println("Maximum number in double Array 1 = "+(doubleCollect1.max()));
		System.out.println("Minimum number in double Array 1 = "+(doubleCollect1.min())+"\n");
		
		Double[] doubleArray2 = {2.5, 6.3, 9.7, 13.4, 2.1, -5.9};
		DoubleCollection doubleCollect2 = new DoubleCollection(doubleArray2, 2);
		
		doubleCollect2.printCollection();
		System.out.println("Maximum number in double Array 2 = "+(doubleCollect2.max()));
		System.out.println("Minimum number in double Array 2 = "+(doubleCollect2.min())+"\n");
	}

}
