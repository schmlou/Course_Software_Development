//The code for the second assignment for the course "Practice: Software Development"
package assignment_02;
/*By creating this Main, you can just call the Method "idw" with the Input*/
public class Main{

	public static void main (String [] args) {
//The Inputs can be seen as kind of a table with rows and columns.
		double[][] exampleInput = {
				{1.0, Double.NaN, 3,0},
				{Double.NaN, Double.NaN, 2.0},
				{4.0, 5.0, Double.NaN}
		};
		
	idw(exampleInput);
		
	}
/* Looking trough every value of the Input-arrays.
 * rows = x and columns = y
 * While going trough every array, 
 * we look for points without data = NaN */
	
	
	
	static double [][] idw(double[][] data) {
		
		double w;
		double s;
		double ws;
		
		for (int x = 0; x < data.length; x++) {
			for (int y = 0; y < data[x].length; y++) {	
/*If we find a NaN, the if-loop starts.
 * Now the calculation-part of the idw starts */
				if(Double.isNaN(data[x][y])) {
					
					ws = 0;
					s = 0;
					w = 0;
					
/*After triggering the if-loop, we create a new array with all known values.
 * They are needed to calculate the distances 
 * Array with known values xi = rows yj = columns*/						
					
					for (int xi = 0; xi < data.length; xi++) {
						for (int yi = 0; yi < data[xi].length; yi++) {
							if (!Double.isNaN(data[xi][yi])) {
/* Now the distance between the known (x & y) and 
 * unknown (xi & yi) value needs to be calculated:
 * d = sqr((x-xi)² + (y-yi)²)*/
								double d = Math.sqrt((Math.pow(x-xi, 2)) - (Math.pow(y - yi, 2)));
/* Calculate the weights with the calculated distance: 
 * w = 1/(d with power P) and the power
 * Power = 2 in this assignment*/
								double w = 1/ Math.pow(d, 2);
/* Calculating the weighted sum
 * ws = (w*known value) + ... + (w*known value)*/
								
								ws = ws + w * data[xi][yi];
								
							}
						} 
					}
				}
			}
		}
		
//The final estimation Z(P) = weighted Sum/weight
	}
}