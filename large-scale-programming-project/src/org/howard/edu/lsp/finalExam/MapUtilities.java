package org.howard.edu.lsp.finalExam;

import java.util.HashMap;

public class MapUtilities {
/**
 * 
 * @param map1
 * @param map2
 * @return the count of the common key-value pairs in two hashmaps.
 * @throws NullMapException
 */
	    public static int commonKeyValuePairs(
	        HashMap<String, String> map1,
	        HashMap<String, String> map2) throws NullMapException
	    {
	    int count = 0;
	    
	    if ((map1 == null) || (map2 == null))
	    {
	    	throw new NullMapException("Either one of the maps is null or both of them are null");
	    	
	    }
	    
	    else if ((map1.isEmpty()) || (map2.isEmpty()))
	    {
	    	return 0;
	    }
	    
	    else
	    {
	    for (String keyName :  map1.keySet())
	    {
	      if (map2.containsKey(keyName)) 
	      {
	        String map1Value = map1.get(keyName);
	        String map2Value = map2.get(keyName);

	        if (map1Value.equals(map2Value))
	        {
	           count ++;
	        }
	      }
	    }
	    
	    return count;
	    }
	}
	  }
	


