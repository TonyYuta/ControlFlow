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
		// examples of usage Java assignment operator(1).
		String aa = "String aa ";
		String bb = "String bb ";
		String cc = aa + bb;
		System.out.println(cc);
		
		// examples of usage Java arithmetic operators (10)
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
		
		//examples of usage Java unary operators (5)
		int result1 = +1;		
		System.out.println(result1);	// => 1
		
		 result1 = -result1;	 
		 System.out.println(result1);	// => -1
		 	
		 result1 ++;	
		 System.out.println(result1);	// => 0
		 	
		 result1 --;	
		 System.out.println(result1);	// => -1
		 	
		 boolean bl = false; 
		 bl = !bl;		
		 System.out.println(bl);	// => true
		
		 // examples of usage Java equality and relational operators (6).
		 int aaa = 3;
		 int bbb = 7;
		 System.out.println(aaa == bbb); 	// => false
		 System.out.println(aaa != bbb); 	// => true
		 System.out.println(aaa > bbb); 	// => false
		 System.out.println(aaa < bbb); 	// => true
		 System.out.println(aaa <= bbb); 	// => true
		 System.out.println(aaa >= bbb); 	// => false
	}
}
