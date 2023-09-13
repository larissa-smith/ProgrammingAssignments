/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author casey
 */
public class NewClass2 {
    
}
/*********************************************************************************
* (Maximum element in an array) Implement the following method that returns the  *
* maximum element in an array.                                                   *
*                                                                                *
* public static <E extends Comparable<E>> E max(E[] list)                        *
*********************************************************************************/
public class Exercise_19_05 {
	/** Returns the maximum element in an array */
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}
}