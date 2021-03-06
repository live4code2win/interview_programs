/**
 * 
 */
/**
 * @author niteen.dhule
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
 *  ii. 
 *  FindingPairInArrayWithKDiff => Array, and `k` with the constant having difference. Find the pairs of numbers in array with difference constant `k`.
 *  Using Map and TreeSet, Check in number present in TreeSet and left => element - k , right => element +k. check left and right 
 *  in the set and create the leftPair and rightPair and add in the hashmap.
 *  leftPair = (left, element)
 *  rightPair = (element, right)
 *  
 *  show the hashmap.keys() of map as it will show the added pairs and map.size() as number of pairs.	
 *  ------------------------------------------------------------------------------------------------------------------------------------------------------
 *  
 *  iii. FindingDuplicateInArray => finding the duplicate in array in one loop, but need extra space for data structure as Set, or Map etc
 *  ------------------------------------------------------------------------------------------------------------------------------------------------------
 *  
 *  iv. InheritanceCallHirarchy => checking Base, Derived class method executions and method hiding. 
 *  Method hiding is the mechanism having child and parent same signature for static method
 *  same applied for variable too.  
 *  ------------------------------------------------------------------------------------------------------------------------------------------------------
 *  v. 
 */
