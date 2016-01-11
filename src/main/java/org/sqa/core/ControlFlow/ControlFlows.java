/**
 *   File Name: ControlFlows.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 5, 2016
 *   
 */

package org.sqa.core.ControlFlow;

/**
 * ControlFlows //ADDD (description of class)
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
public class ControlFlows {
public static void main(String[] args) {
//	int hoursInUse = 8;
//	if (hoursInUse >= 5) {
//		System.out.println("Battery almost dead. Please, connect your device to a charger.");
//	}
//	else if (hoursInUse < 5 && hoursInUse >= 3) {
//		System.out.println("Battery will be finished soon. Please, connect your device to a charger."); 
//	}
//	else if (hoursInUse < 3 && hoursInUse > 1) {
//		System.out.println("Battery is good."); 
//	}
//	else 
//		System.out.println("Battery is excellent.");
//	}
	
	int hoursInUse = 2;
	switch (hoursInUse) {
	case 0: case 1: System.out.println("Battery is excellent.");
	break;
	case 2:
		System.out.println("Battery is good.");
		break;
	case 3: 
	case 4:
		System.out.println("Battery will be finished soon. Please, connect your device to a charger.");
		break;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
		System.out.println("Battery almost dead. Please, connect your device to a charger.");
		break;
	default:
		System.out.println("Please, input how many hours device is working.");
	}
}
}
