/********************************************
*           SSW 567 Assignment 01           *
* ----------------------------------------- *
* Sapana Belorkar, Alexis Moore, Vibha Ravi *
* ----------------------------------------- *
*               Description:                *
*                                           *
*  1. classify triangle based on type       *
*                                           *
*********************************************/

public class Assignment01 {
	//Program determines the type of triangle based on its parameters
	
	public static int classifyTriangle(double a, double b, double c)
	{
		//Triangle Type Definitions
		// 0 EQUILATERAL
		// 1 ISOSCELES
		// 2 SCALENE
		// 3 RIGHT
		int triangleType = -1;
		
		//Determine if Equilateral Triangle
		if(a == b && b == c)
		{
			triangleType = 0;
		}
		//Determine if Right Triangle
		else if (((a * a) + (b * b)) == (c * c))
		{
			triangleType = 3;
		}
		//Determine if Isosceles Triangle
		else if(a == b || a == c || b == c)
		{
			triangleType = 1;
		}
		//Determine if Scalene Triangle
		else
		{
			triangleType = 2;
		}
		return triangleType;
	}
}