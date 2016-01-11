/**
 *   File Name: Operators.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 10, 2016
 *   
 */

package org.sqa.core.ControlFlow;

/**
 * Operators //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class Operators {
	//examples of usage Java assignment operator.
	public static void main(String[] args) {	
		String aa = "String aa ";
		String bb = "String bb ";
		String cc = aa + bb;
		System.out.println(cc);
		
		int a = 10;
		int b = 5;
		int c = 8;
		System.out.println(a + b);	// => 15
		System.out.println(c += a);	// => 18
		System.out.println(a - b);	// => 5
		System.out.println(c -= a);	// => 8
		System.out.println(b % a);	// => 5
		System.out.println(a * b);	// => 50
		System.out.println(c *= a);	// => 80 
		System.out.println(c %= a);	// => 0
		System.out.println(b / a); 	// => 0
		System.out.println(c /= a);	// => 0
		
	}
}
