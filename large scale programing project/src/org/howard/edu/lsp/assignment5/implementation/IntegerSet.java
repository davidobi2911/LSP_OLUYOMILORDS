package org.howard.edu.lsp.assignment5.implementation;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * 
 * @author USER
 *
 */
public class IntegerSet {
		// Hint: probably best to use an array list.  You will need to do a little research
		private ArrayList<Integer> set = new ArrayList<Integer>();
	  public ArrayList<Integer> getSet() { return set;}
      
	 
		
	  /**
	   *  Default Constructor
	   */
		public IntegerSet() {
	    
		}

		
		/**
		 * Clears the internal representation of the set

		 */
	public void clear() {
	  set.clear();
	  

	  
	};
	/**
	 * add an item to the set
	 * 
	 * @param item
	 */
	 public void add(int item) {
		    if (!set.contains(item)) {
		      set.add(item);
		    }
		  }


	
	 /**
	  * Returns the length of the set
	  * @return
	  */
	public int length() 
	  {
	    return set.size();
	  }; 

	
	  /**
	   * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	   * @param b
	   * 
	   * @return true if it is equal
	   * 
	   * 
	    * 
	*/
	
	
	public boolean equals(IntegerSet b) {
	  int amount = 0;
	  for(int i = 0; i < set.size(); i++)
	  {
		  if (b.getSet().contains(set.get(i)))
		  {
			  amount += 1;
			  
		  }
	  }
	if (amount == set.size())
	  {
	    return true;
	  }
	  else{
	    return false;
	  }
	} 
	


	/**
	 *  Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
	  return set.contains(value);
	} 

	
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
	  if (set.size() == 0) {
	    throw new IntegerSetException("This is an empty set");
	  }
	  else{
	    return Collections.max(set);
	  }
	
	}; 

	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * 
	 * @return
	 * @throws IntegerSetException 
	 */
	public int smallest() throws IntegerSetException{
	  if (set.size() == 0)
	  {
	    throw new IntegerSetException("This is an empty set");
	  }
	  else
	  {
	    return Collections.min(set);
	    
	  }
	}
	  


	
	  /**
	   * Removes an item from the set or does nothing if not there
	   * @param item
	   * @throws IntegerSetException
	   */

 public void remove(int item) throws  IntegerSetException {
	ArrayList<Integer> output = new ArrayList<Integer>();
	  if (set.isEmpty())
	  {
	    throw new IntegerSetException("This set is empty");
	    
	  }
	  else {
		 
		for(int i = 0; i < set.size(); i++ )
		  {
			  if(set.get(i) != item)
			  {
				  output.add(set.get(i));
			  }
		
		  }
		  set = output;
	  }
	  
	  
	  
	} 
	/**
	 * Throws a IntegerSetException of the set is empty
	 *  Set union
	 * @param intSetb
	 * 	 */
	public void union(IntegerSet intSetb) {
	  if (set.isEmpty() || intSetb.getSet().isEmpty()) {
	    throw new RuntimeException("Empty set in union");
	  }
	  ArrayList<Integer> localList = intSetb.getSet();

	  for (int i=0; i < localList.size(); i++)
	    {
	      add(localList.get(i));
	    }
	}


	/**
	 * set intersection between two sets
	 * @param intSetb
	 * 
	 */
	public void intersect(IntegerSet intSetb) {
	  List<Integer> newList = new ArrayList<Integer>();
	  for (int i = 0; i < set.size(); i++)
	    {
	      if (intSetb.getSet().contains(i))
	      {
	        newList.add(i);
	      }
	      {
	    set  = (ArrayList<Integer>) newList; 
	      }
	    }
	  
	}; 

	
	/**
	 * Set difference, i.e., s1 –s2
	 * @param intSetb 
	 */
	public void diff(IntegerSet intSetb) {
		
	
	  List<Integer> diffList = new ArrayList<Integer>();
	  for (int i= 0; i < set.size(); i++)
	    {
	      if (!intSetb.getSet().contains(i))
	      {
	        diffList.add(i);
	      }
	      
	  if (diffList.isEmpty())
	  {
	    System.out.println("There is no difference ");
	  }

	  set = (ArrayList<Integer>) diffList;
	    }
	} ;


	/**
	 *  Returns true if the set is empty, false otherwise
	 * @return
	 */
	boolean isEmpty()
	  {
	    return set.isEmpty();
	  }; 

	/**
	 *  Return String representation of your set
	 */
	public String toString() {
	  return set.toString();
	  


           }}
	
	
	