/**
 * 
 */
/**
 * @author niteend
 *
 */
package core.util;

/*
 * i. 
 * 	UniqueElementInArray - It will find the unique number in the duplicated items in array.
 * 	This is the unique solution to find the odd duplicate number if other all element are in even number duplicated and has only one duplicate with odd number 
 * 	It uses XOR Bitwise operator to find the unique number in other duplicated number (duplicates should be in even number)
 * 	XOR result 0 for even number duplicate number. and when 0 is XOR'ed with Unique number or odd duplicated number it will result in to that number 
 * 
 * EX.  1 ^ 0 => 1
 * 		
 * 		0001
 * 	^	0000
 * ----------
 *  	0001
 *  
 *  2 ^ 2 => 0
 *  
 *  	0010
 *  ^	0010
 *  ---------
 *  	0000
 *  	
 * 
 *  XOR => 	1 ^ 1 	= 0
 *  		0 ^ 0	= 0
 *  		1 ^ 0 	= 1
 *  		0 ^	1	= 1
 *  ------------------------------------------------------------------------------------------------------------------------------------------------------
 *  		
 *  
 */
