package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

public class Driver {
	// Below is sample of how your driver should look.  Your driver contains your main method and its primary function is to test your IntegerSet class.  Every method in IntegerSet should be sufficiently tested and your output easy to read.  Below is a small example of the granularity of how your output should look.  Each operation on a method should show the contents of your IntegerSet before and after each operation.  Part of your grade on this assignment is how expressive your output is.
	// …
	// IntegerSet set1 = new IntegerSet();
	// set1.add(1);

	//testing to string method
	
//throws IntegerSetException

	

	  public static void main(String[]args) {
	    IntegerSet set1 = new IntegerSet();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    
	    IntegerSet set2 = new IntegerSet();
		set2.add(3);
		
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Smallest value of set" + set1.smallest());
		System.out.println("Largest value in Set1 is:" + set1.largest());

		 

	    // testing clear method
	  System.out.println("Set before clearing is " + set1.getSet());
	  set1.clear();
	  System.out.println("Set after clearing is " + set1.getSet().toString());
	    

	  //testing to string method
	 System.out.println (" Value of Set1 is:" + set1.toString());
	  //testing the smallest method
	System.out.println("Smallest value in Set1 is:" + set1.smallest());

	//testing the largest method
	System.out.println("Largest value in Set1 is:" + set1.largest());
	    //testing the length method
	    IntegerSet set3;
		System.out.println("The length of set3 which is" + set3.getSet());


	    //testing union method
	System.out.println("Union of Set1 and Set2");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	set1.union(set2);	// union of set1 and set2
	System.out.println("Result of the union of set1 and set2");
	set1.toString();	// result of union of set1 and set2

	  //testing the remove method

	  System.out.println("Set before removing element: " + set1.getSet().toString());

	  set1.remove(3);
	  System.out.println("Set after removing element: " + set1.getSet().toString());
	    

	// testing the intersect method
	  System.out.println("Intersection of set1 and set2: ");
	  System.out.println("Value of set1: " + set1.toString());
	  System.out.println("Value of set2: " + set2.toString());
	  set1.intersect(set2); //intersection of set1 and set2
	  System.out.println("Result of intersection of set1 and set2: "); 
	  set1.toString();

	  
	//testing the difference method
	 System.out.println("Difference between set1 and set2: ");
	System.out.println("Value of set1: " + set1.toString());
	System.out.println("Value of set2: " + set2.toString());
	set1.diff(set2); //difference of the two sets
	System.out.println("Result of the difference of set1 and set2: ");
	set1.toString();

	//testing equals method
	System.out.println("Checking if set1 and set2 are equal: ");
	System.out.println("Value of set1: " + set1.toString());
	System.out.println("Value of set2: " + set2.toString());

	System.out.println("Result of the check is: " + set1.equals(set2));

}}
