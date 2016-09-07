/********************************************
*           SSW 567 Assignment 01           *
* ----------------------------------------- *
* Sapana Belorkar, Alexis Moore, Vibha Ravi *
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. Tests for types of triangles          *
*                                           *
*********************************************/

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Assignment01Junit {
	
   @Test
	//Checks if triangle is Equilateral for Int Inputs
	public void checkEquilateralI()
	{
		int a = 3;
		int b = 3;
		int c = 3;
		int result = Assignment01.classifyTriangle(a, b, c);
		assertEquals(result, 0);
	}

   @Test
 //Checks if triangle is Equilateral for Double Inputs
 	public void checkEquilateralD()
 	{
 		double a = 3.53;
 		double b = 3.53;
 		double c = 3.53;
 		int result = Assignment01.classifyTriangle(a, b, c);
 		assertEquals(result, 0);
 	}
   
   @Test
	//Checks if triangle is Right for Int Inputs
	public void checkRightI()
	{
		int a = 3;
		int b = 4;
		int c = 5;
		int result = Assignment01.classifyTriangle(a, b, c);
		assertEquals(result, 3);
	}

   @Test
 //Checks if triangle is Right for Double Inputs
 	public void checkRightD()
 	{
 		double a = 5.0;
 		double b = 4.0;
 		double c = Math.sqrt(41);
 		int result = Assignment01.classifyTriangle(a, b, c);
 		assertEquals(result, 3); 
 	}

}