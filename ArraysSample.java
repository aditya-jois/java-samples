import java.util.Arrays;
import java.util.List;

public class ArraysSample {

	public static void main(String[] args) {
		int[] intArray;
		byte[] byteArray;
		short[] shortArray;
		long[] longArray;
		float[] floatArray;
		double[] doubleArray;
		boolean[] booleanArray;
		char[] charArray;
		String[] stringArray;

		// You can also place the brackets after the array's name
		// However, convention discourages this form; the brackets identify the
		// array type and should appear with the type designation.
		float anArrayOfFloats[];

		// One way to create an array is with the new operator.
		intArray = new int[10];

		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;

		// shortcut syntax
		int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		// multidimensional array
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

		System.out.println(anArray.length);

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
				't', 'e', 'd' };
		char[] copyTo = new char[7];

		// the starting position in the destination array, and the number of
		// array elements to copy.
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

		char[] copyFromRange = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n',
				'a', 't', 'e', 'd' };
		// the initial index of the range to be copied, inclusively, while the
		// third parameter is the final index of the range to be copied,
		// exclusively.
		char[] copyToRange = Arrays.copyOfRange(copyFromRange, 2, 9);
		System.out.println(new String(copyToRange));

		List<String> stringList = Arrays.asList("1", "2");
		List<Integer> integerList = Arrays.asList(1, 2);

		/*
		 * Some other useful operations provided by methods in the
		 * java.util.Arrays class, are:
		 * 
		 * Searching an array for a specific value to get the index at which it
		 * is placed (the binarySearch method). Comparing two arrays to
		 * determine if they are equal or not (the equals method). Filling an
		 * array to place a specific value at each index (the fill method).
		 * Sorting an array into ascending order. This can be done either
		 * sequentially, using the sort method, or concurrently, using the
		 * parallelSort method introduced in Java SE 8. Parallel sorting of
		 * large arrays on multiprocessor systems is faster than sequential
		 * array sorting.
		 */
	}

}
