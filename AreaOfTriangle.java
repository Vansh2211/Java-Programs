import java.lang.*;
import java.util.*;

/*
 * 
 */
public class AreaOfTriangle{
	// public static int area(int base,int height){
	// 	int NewArea = 0;
	// 	float Area =  (base*height)/2;
	// 	NewArea = Area;

	// 	return NewArea;
	// }
	public static float  largestTriangle(int base1, int height1, int base2, int height2)
	{
		float  answer = 0;
		// Write your code here
		float Area11  = (base1*height1)/2;
		float Area22  = (base2*height2)/2;

		// Solution ar = new Solution();
		// int Area1 = ar.area(base1,height1);
		// int Area2 = ar.area(base2,height2);

		if(Area11>Area22){
		    answer = Area11;
		}
		else{
			answer = Area22;
		}


		
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// input for base1
		int base1 = in.nextInt();
		
		// input for height1
		int height1 = in.nextInt();
		
		// input for base2
		int base2 = in.nextInt();
		
		// input for height2
		int height2 = in.nextInt();
		
		
		float result = largestTriangle(base1, height1, base2, height2);
		System.out.print(result);
		
	}
}

