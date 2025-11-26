/*The code for the second assignment for the course "Practice: Software Development"*/
package assignment_02;

/*needed for the List and ArrayList function*
import java.util.ArrayList;
import java.util.List;

/*By creating this Main, you can just call the Method "idw" with the Input*/
public class Main {

	public static void main(String[] args) {
		/* The Inputs can be seen as kind of a table with rows and columns.*/
		double[][] exampleInput = { { 1.0, Double.NaN, 3.0 }, { Double.NaN, Double.NaN, 2.0 }, { 4.0, 5.0, Double.NaN } };

		/*Method for calling function IDW*/
		double[][] z = idw(exampleInput);
		printArr(z);
	}
	/*
	 * Looking trough every value of the Input-arrays. rows = x and columns = y
	 * While going trough every array, we look for points without data = NaN
	 */

	static double[][] idw(double[][] data) {
		/*
		 * Create a copy of the data to store interpolated values by using deepCopy
		 * DeepCopy ensures that the "original" Data doesn't get changed by creating a
		 * whole new instance
		 */
		double[][] z = deepCopy(data);

		/*
		 * Track positions of estimated NaN values is needed to print out the NaN values
		 * later
		 */
		List<String> estimatedValues = new ArrayList<>();

		double w;
		double s;
		double ws;

		for (int x = 0; x < data.length; x++) {
			for (int y = 0; y < data[x].length; y++) {
				/*
				 * If we find a NaN, the if-loop starts. Now the calculation-part of the idw
				 * starts
				 */
				if (Double.isNaN(data[x][y])) {

					ws = 0.0;
					s = 0.0;
					w = 0.0;

					/*
					 * After triggering the if-loop, we create a new array with all known values.
					 * They are needed to calculate the distances Array with known values xi = rows
					 * yj = columns
					 */

					for (int xi = 0; xi < data.length; xi++) {
						for (int yi = 0; yi < data[xi].length; yi++) {
							if (!Double.isNaN(data[xi][yi])) {
								/*
								 * Now the distance between the known (x & y) and unknown (xi & yi) value needs
								 * to be calculated: d = sqrt((x-xi)² + (y-yi)²)
								 */
								double d = Math.sqrt((Math.pow(x - xi, 2)) + (Math.pow(y - yi, 2)));
								/*
								 * Calculate the weights with the calculated distance: w = 1/(d with power P)
								 * and the power Power = 2 in this assignment
								 */
								w = 1 / (Math.pow(d, 2));
								/*
								 * Calculating the weighted sum ws = (w*known value) + ... + (w*known value)
								 */
								ws = ws + w * data[xi][yi];
								/*
								 * Calculating the sum of weights s = w + w + ... + w
								 */
								s = s + w;
							}
						}
					}
					/* z = weighted sum/sum of weights */
					z[x][y] = ws / s;
					/*
					 * Calculating the "original" unknown value (NaN) and store the estimated value
					 * at the position
					 */
					estimatedValues.add("Position [" + x + "][" + y + "]: " + z[x][y]);

					/*
					 * The following Print statement only prints out the estimated NaN values the
					 * first and last line are just for aesthetic
					 * Following print-statements:
					 * Used it for understanding the the loop now not needed and not so nice because
					 * every loop gets printed out =>to much in console ;)
					 */

					/*
					 * System.out.println("===Estimated Values==="); for (String value :
					 * estimatedValues) { System.out.println(value); } System.out.println();
					 * System.out.println("____Full Array____");
					 */

				}
			}
		}
		return z;
	};

	/*
	 * The following deepCopy makes sure, that we DON'T modify our "original" Data
	 * by creating a new deepCopy and returning a new instance "copiedArr"
	 */
	static double[][] deepCopy(double[][] copyArr) {
		/*
		 * creates new array copedArr with same amount of rows as copyArr
		 */
		double[][] copiedArr = new double[copyArr.length][];
		for (int x = 0; x < copyArr.length; x++) {
			/*
			 * creates array same length as copyArr all elements from copyArr[i] to new
			 * Array new array stored in copiedArr
			 */
			copiedArr[x] = java.util.Arrays.copyOf(copyArr[x], copyArr[x].length);
		}
		return copiedArr;
	}

	/*
	 * The final print function to get the the full array with original data and the
	 * now estimated NaN values
	 * 	 */
	static void printArr(double[][] finalArr) {
		for (int x = 0; x < finalArr.length; x++) {
			for (int y = 0; y < finalArr[x].length; y++) {
				/*
				 * printf = formated print with minimum 8 values and 
				 * 2 digits after decimal (could be changed if wanted)
				 */
				System.out.printf("%8.2f ", finalArr[x][y]);
			}
			System.out.println();
		}
	}

}
